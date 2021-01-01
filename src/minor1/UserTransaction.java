
	//        jdbc:mysql://localhost:3306/akmal
	// 		  C:>set classpath=C:\Users\Lenovo\Downloads\mysql-connector-java-8.0.21-bin.jar;.;  

package minor1;


import java.sql.*;  
import javax.swing.table.DefaultTableModel;

public class UserTransaction{

	

//          check balance function
    
            int checkBalance(){
                int balance = 0;
                   try{  
                       Class.forName("com.mysql.jdbc.Driver");
                       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minor","root","root");  
                      PreparedStatement pr = con.prepareStatement("SELECT * FROM account WHERE cardnumber = ?");
                      pr.setString(1, AtmPin.cardNumber);
                       ResultSet set=pr.executeQuery(); 
                      while(set.next()){
                        if(SavCurCheck.saving){
                         balance = set.getInt("savbal");
                                              }
                        
                        else{
                        balance = set.getInt("curbal");
                                             
                        }

                      }
                   con.close();  
                   pr.close();
                   set.close();
                   }
                   catch(Exception e){ System.out.println(e);}  
                 return balance;
            }
  
            //      withdraw function 
            
            Boolean withdraw(int amount){
                //here "balance" is savbal or curbal of user
                int balance = checkBalance();
                // withdraw "amount" deducted from "balance"
                balance = balance - amount;
                try{  
                       Class.forName("com.mysql.jdbc.Driver");
                       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minor","root","root");  
                     PreparedStatement  pr;
                      // savbal/curbal
                      if(SavCurCheck.saving){
                                                                 pr = con.prepareStatement("UPDATE account SET savbal = ? WHERE cardnumber =?");

                      }
                      else{
                                                                   pr = con.prepareStatement("UPDATE account SET curbal = ? WHERE cardnumber =?");

                      }
                      
                      // balance
                      
                      pr.setInt(1, balance);
                      
                      // cardnumber
                      pr.setString(2, AtmPin.cardNumber);
                      
                       pr.executeUpdate();
                       
                        //updating amountlimit
                       pr = con.prepareStatement("UPDATE account SET withdrawlimit = withdrawlimit - ? WHERE cardnumber = ?");
                       pr.setInt(1,amount);
                       pr.setString(2,AtmPin.cardNumber);
                       pr.executeUpdate();
                       
                       // updating history table
                       pr = con.prepareStatement("INSERT INTO history(username,cardnumber,acctype,transtype,date,time,amount,admin) VALUES(?,?,?,'withdraw',CURDATE(),CURTIME(),?,?)");
                       pr.setString(1,AtmPin.userName);
                       pr.setString(2,AtmPin.cardNumber);
                       if(SavCurCheck.saving){
                       pr.setString(3,"saving");
                       }
                       else{
                       pr.setString(3,"current");                      
                       }
                       pr.setInt(4, amount);
                       pr.setString(5,Login.username);
                       pr.executeUpdate();

                       // updating admininfo "given"
                       
                       pr = con.prepareStatement("UPDATE admininfo SET given = given + ? WHERE username =?");
                       pr.setInt(1, amount);
                       pr.setString(2, Login.username);
                       pr.executeUpdate();

//                      ADMIN SE BHI LOGIN KARWAO TAKI PATA CHALE  KISKE KHATE ME  DALNA H                      


System.out.println("withdraw successfull");
                     
                   con.close();  
                   pr.close();
                   return true;
                   }
                   catch(Exception e){ System.out.println(e);
                   return false;
                   }  
            }
            
            //  deposit function
            
            Boolean deposit(int deposit){
                 int balance = checkBalance();
                balance = balance + deposit;
                
//          jdbc

 try{  
                       Class.forName("com.mysql.jdbc.Driver");
                       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minor","root","root");  
                     PreparedStatement  pr;
                      // savbal/curbal
                      if(SavCurCheck.saving){
                                                                 pr = con.prepareStatement("UPDATE account SET savbal = ? WHERE cardnumber =?");

                      }
                      else{
                                                                   pr = con.prepareStatement("UPDATE account SET curbal = ? WHERE cardnumber =?");

                      }
                      
                      // balance
                      
                      pr.setInt(1, balance);
                      
                      // cardnumber
                      pr.setString(2, AtmPin.cardNumber);
                      
                       pr.executeUpdate();
                       
                       //updating amountlimit
                       pr = con.prepareStatement("UPDATE account SET amountlimit = amountlimit - ? WHERE cardnumber = ?");
                       pr.setInt(1,deposit);
                       pr.setString(2,AtmPin.cardNumber);
                       pr.executeUpdate();
                       
                                              // updating hostory table
                       pr = con.prepareStatement("INSERT INTO history(username,cardnumber,acctype,transtype,date,time,amount,admin) VALUES(?,?,?,'deposit',CURDATE(),CURTIME(),?,?)");
                       pr.setString(1,AtmPin.userName);
                       pr.setString(2,AtmPin.cardNumber);
                       if(SavCurCheck.saving){
                       pr.setString(3,"saving");
                       }
                       else{
                       pr.setString(3,"current");                      
                       }
                       pr.setInt(4, deposit);
                       pr.setString(5,Login.username);
                       pr.executeUpdate();
                       
                       // updating admininfo "given"

                       pr = con.prepareStatement("UPDATE admininfo SET received = received + ? WHERE username =?");
                       pr.setInt(1, deposit);
                       pr.setString(2, Login.username);
                       pr.executeUpdate();
                       
                    System.out.println("deposit successfull");
                     
                   con.close();  
                   pr.close();
                   return true;
                   }
                   catch(Exception e){ System.out.println(e);
                   return false;
                   }  
              
            }
            
            //      change pin
            
            Boolean changePin(String pin){
            

            try{  
                                  Class.forName("com.mysql.jdbc.Driver");
                                  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minor","root","root");  
                                PreparedStatement  pr= con.prepareStatement("UPDATE userlogin SET pin = ? WHERE cardnumber =?");

                                 // balance

                                 pr.setString(1, pin);

                                 // cardnumber
                                 pr.setString(2, AtmPin.cardNumber);

                                  pr.executeUpdate();
                                  
                                                         // updating hostory table
                       pr = con.prepareStatement("INSERT INTO history(username,cardnumber,acctype,transtype,date,time,amount) VALUES(?,?,'.','pin change',CURDATE(),CURTIME(),0)");
                       pr.setString(1,AtmPin.userName);
                       pr.setString(2,AtmPin.cardNumber);
                       pr.executeUpdate();

                               System.out.println("pin changed successfull");

                              con.close();  
                              pr.close();
                              return true;
                              }
                              catch(Exception e){ 
                                  System.out.println(e);
                        
                           return false;
                       }
            }
            
            // checking status of deposit amount of the day
            int checkDepositLimit(){
                int checkamountlimit = 0;
                   try{  
                       Class.forName("com.mysql.jdbc.Driver");
                       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minor","root","root");  
                      PreparedStatement pr = con.prepareStatement("SELECT * FROM account WHERE cardnumber = ?");
                      pr.setString(1, AtmPin.cardNumber);
                       ResultSet set=pr.executeQuery(); 
                      while(set.next()){
                        
                        checkamountlimit = set.getInt("amountlimit");
                                             
                        

                      }
                   con.close();  
                   pr.close();
                   set.close();
                   }
                   catch(Exception e){ System.out.println(e);}  
                 return checkamountlimit;
            }
            
            // checking status of withdraw amount of the day
            
            int checkWithdrawLimit(){
                int withdrawlimit =0;
                   try{  
                       Class.forName("com.mysql.jdbc.Driver");
                       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minor","root","root");  
                      PreparedStatement pr = con.prepareStatement("SELECT * FROM account WHERE cardnumber = ?");
                      pr.setString(1, AtmPin.cardNumber);
                       ResultSet set=pr.executeQuery(); 
                      while(set.next()){
                        
                        withdrawlimit = set.getInt("withdrawlimit");
                                             
                        

                      }
                   con.close();  
                   pr.close();
                   set.close();
                   }
                   catch(Exception e){ System.out.println(e);}  
                
            return withdrawlimit;
            }
            
            // table mini statement

                            Boolean getTable(){                //copied in MiniStatement.java

String acctype,transtype,date,time,amount,admin;
                   try{  
                       Class.forName("com.mysql.jdbc.Driver");
                       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minor","root","root");  
                       PreparedStatement pr = con.prepareStatement("SELECT * FROM history WHERE cardnumber = ? ORDER BY date DESC LIMIT 5");
                       pr.setString(1, AtmPin.cardNumber);
                       ResultSet set=pr.executeQuery(); 
                       while(set.next()){
                                                    acctype=set.getString("acctype");
                                                    transtype=set.getString("transtype");
                                                    date=String.valueOf(set.getDate("date"));
                                                    time=String.valueOf(set.getTime("time"));
                                                    amount=String.valueOf(set.getInt("amount"));
                                                    admin=set.getString("admin");
                                                     String record [] = {acctype,transtype,date,time,amount,admin,null};
                                                     DefaultTableModel tblModel = (DefaultTableModel)MiniStatement.miniStatementTB.getModel();
                                                     tblModel.addRow(record);
                      }
                   con.close();  
                   pr.close();
                   set.close();
                   return true;
                   }
                   catch(Exception e){ System.out.println(e);
                    return false;
                   }  
            }
           
            // check last date in table
                            
                            Date checkLastDate(){
                                Date lastDate = null;
                                
                                  try{  
                       Class.forName("com.mysql.jdbc.Driver");
                       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minor","root","root");  
                      PreparedStatement pr = con.prepareStatement("SELECT * FROM userLogin WHERE cardnumber = ?");
                      pr.setString(1, AtmPin.cardNumber);
                       ResultSet set=pr.executeQuery(); 
                      while(set.next()){
                          
                         lastDate = set.getDate("lastDate");

                      }
                      
                      
                   con.close();  
                   pr.close();
                   set.close();
                   }
                   catch(Exception e){ System.out.println(e);}  
        
                                
                                System.out.println("last date "+ lastDate);
                                return lastDate;
                            }
                            
                           
                            // reset withdrawLimit AmountLimit and last login date;
                            void reset(){
                                    
                                 try{  
                                  Class.forName("com.mysql.jdbc.Driver");
                                  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minor","root","root");  
                                PreparedStatement  pr= con.prepareStatement("UPDATE account SET withdrawlimit = 10000, amountlimit = 20000 WHERE cardnumber =?");

                                 pr.setString(1, AtmPin.cardNumber);

                                  pr.executeUpdate();
                                  
                                                         // updating userLogin
                       pr = con.prepareStatement("UPDATE userLogin SET lastDate = CURDATE() WHERE cardnumber=?;");
                       pr.setString(1,AtmPin.cardNumber);
                       pr.executeUpdate();

                               System.out.println(" Reset successfull");

                              con.close();  
                              pr.close();
                              
                              }
                              catch(Exception e){ 
                                  System.out.println(e);}
                        
                           
                            }
                            
                         
}

