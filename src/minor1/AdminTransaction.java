
package minor1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class AdminTransaction {
    
    // setting  home lable
    int[] setLbl(){
    int [] ans = new int[2];
    
       try{  
                       Class.forName("com.mysql.jdbc.Driver");
                       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minor","root","root");  
                      PreparedStatement pr = con.prepareStatement("SELECT * FROM admininfo WHERE username = ?");
                      pr.setString(1, Login.username);
                       ResultSet set=pr.executeQuery(); 
                      while(set.next()){
                        ans[1] = set.getInt("received");
                        ans[0] = set.getInt("given");

                      }
                   con.close();  
                   pr.close();
                   set.close();
                   }
                   catch(Exception e){ System.out.println(e);}  
    
    return ans;
    }
    
    //resting home lable
    void resetLbl(){
     try{  
                                  Class.forName("com.mysql.jdbc.Driver");
                                  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minor","root","root");  
                                PreparedStatement  pr = con.prepareStatement("UPDATE admininfo SET received = 0 WHERE username = ?");
                                pr.setString(1,Login.username);
                                  pr.executeUpdate();
                                  
                                 pr = con.prepareStatement("UPDATE admininfo SET given = 0 WHERE username = ?");
                                pr.setString(1,Login.username);
                                  pr.executeUpdate();
                                  
                                  
                               System.out.println("reset successfull");

                               
                              con.close();  
                              pr.close();
                              
                              }
                              catch(Exception e){ 
                                  System.out.println(e);
                              }
                           
    }
    
    // setting history table
    Boolean setTbl(){
    String username,cardnumber, acctype,transtype,date,time,amount;
                   try{  
                       Class.forName("com.mysql.jdbc.Driver");
                       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minor","root","root");  
                       PreparedStatement pr = con.prepareStatement("SELECT * FROM history WHERE admin = ? ORDER BY date DESC");
                       pr.setString(1, Login.username);
                       ResultSet set=pr.executeQuery(); 
                       while(set.next()){
                                                    username=set.getString("username");    
                                                    cardnumber=set.getString("cardnumber");
                                                    acctype=set.getString("acctype");
                                                    transtype=set.getString("transtype");
                                                    date=String.valueOf(set.getDate("date"));
                                                    time=String.valueOf(set.getTime("time"));
                                                    amount=String.valueOf(set.getInt("amount"));
                                                    
                                                     String record [] = {username,cardnumber,acctype,transtype,date,time,amount,null};
                                                     DefaultTableModel tblModel = (DefaultTableModel)HistoryAdmin.historyAdminTbl.getModel();
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
 
    // setting check status table
    
       Boolean setTbl(String cardNumber){
    String username, acctype,transtype,date,time,amount;
                   try{  
                       Class.forName("com.mysql.jdbc.Driver");
                       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minor","root","root");  
                       PreparedStatement pr = con.prepareStatement("SELECT * FROM history WHERE cardnumber = ? and admin = ? ORDER BY date DESC");
                       pr.setString(1, cardNumber);
                       pr.setString(2, Login.username);
                       ResultSet set=pr.executeQuery(); 
                       while(set.next()){
                                                    username=set.getString("username");    
                                                    
                                                    acctype=set.getString("acctype");
                                                    transtype=set.getString("transtype");
                                                    date=String.valueOf(set.getDate("date"));
                                                    time=String.valueOf(set.getTime("time"));
                                                    amount=String.valueOf(set.getInt("amount"));
                                                    
                                                     String record [] = {username,acctype,transtype,date,time,amount,null};
                                                     DefaultTableModel tblModel = (DefaultTableModel)CheckStatus.checkStatusTbl.getModel();
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
       
       // clear check status table
       void clearTbl(){
       CheckStatus.checkStatusTbl.setModel(new DefaultTableModel(null,new String[] {"Customer Name", "Account Type","Transaction Type","Date","Time","Amount"}));
       }
       
       // checkLastLogin of user
       Date checkLastDate(String cardnumber){
           Date lastDate = null;
             try{  
                       Class.forName("com.mysql.jdbc.Driver");
                       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minor","root","root");  
                      PreparedStatement pr = con.prepareStatement("SELECT * FROM userLogin WHERE cardnumber = ?");
                      pr.setString(1, cardnumber);
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
       
      
       
       // change password
       Boolean changePassword(String password){
         try{  
                                  Class.forName("com.mysql.jdbc.Driver");
                                  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minor","root","root");  
                                PreparedStatement  pr= con.prepareStatement("UPDATE adminLogin SET password = ? WHERE username =?");

                                 pr.setString(1, password);

                                 pr.setString(2, Login.username);

                                  pr.executeUpdate();
                                  
                                                      
                               System.out.println("password changed successfull");

                              con.close();  
                              pr.close();
                              return true;
                              }
                              catch(Exception e){ 
                                  System.out.println(e);
                        
                           return false;
                       }
       }
}
