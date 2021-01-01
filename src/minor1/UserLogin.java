package minor1;

import java.lang.*;
import java.sql.*;  

public class UserLogin{
        Boolean flag=false;

            Boolean check(){
                   try{  
                       Class.forName("com.mysql.jdbc.Driver");  // loading the driver
                       // or DriverManager.registerDriver(new com.mysql.jdbc.Driver()); to load the driver

                       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minor","root","root");  //creating connection "Connection" is an interface in java.sql class
                                                                  // "url"            servername^ "username","password"
                       //here minor is database name, root is username and password  
                       //create query, statement, prepared statement( for statements with ?) , and callablestatement
                       Statement stmt=con.createStatement();  

                       ResultSet set=stmt.executeQuery("select * from userLogin");  // firing query by executeQuery. executeUpdate, and a simply execute.

                       while(set.next()){
                               String usernameDB = set.getString("username");
                               String cardnumberDB = set.getString("cardnumber");
                               String pinDB = set.getString("pin");

                               if (AtmPin.userName.equals(usernameDB) && AtmPin.cardNumber.equals(cardnumberDB) && AtmPin.pin.equals(pinDB)){
                                       flag = true;
                                          PreparedStatement pr = con.prepareStatement("UPDATE userLogin SET state = 0 WHERE cardnumber = ?");
                                            pr.setString(1, AtmPin.cardNumber);
                                            pr.executeUpdate(); 
                                    } 
                             
                   }
                   
                   if(flag == false){
                                          PreparedStatement pr = con.prepareStatement("UPDATE userLogin SET state = state + 1 WHERE cardnumber = ?");
                                            pr.setString(1, AtmPin.cardNumber);
                                            pr.executeUpdate(); 
                               }
                   con.close();  
                   }
                   catch(Exception e){ System.out.println(e);}  
                   return flag;
            }
            
            Boolean checkStatus(){
                  int status = 0;
                   try{  
                       Class.forName("com.mysql.jdbc.Driver");
                       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minor","root","root");  
                      PreparedStatement pr = con.prepareStatement("SELECT * FROM userLogin WHERE cardnumber = ?");
                      pr.setString(1, AtmPin.cardNumber);
//                      pr.setString(1, "1234");

                       ResultSet set=pr.executeQuery(); 
                      while(set.next()){
                        
                         status = set.getInt("state");
                      }
                   con.close();  
                   pr.close();
                   set.close();
                  
                   }
                   catch(Exception e){ System.out.println(e);
                   return false;

                   }  
                   if(status>3){
                       System.out.println(status);
                   return true;
                   }
                   else{
                       System.out.println(status);
                       return false;
                   }
                 
            }
}
