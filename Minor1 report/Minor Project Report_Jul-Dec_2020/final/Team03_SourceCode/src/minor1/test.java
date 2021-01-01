
package minor1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class test {
    
     Date checkLastDate(){
                                Date lastDate = null;
                                
                                  try{  
                       Class.forName("com.mysql.jdbc.Driver");
                       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minor","root","root");  
                      PreparedStatement pr = con.prepareStatement("SELECT * FROM userLogin WHERE cardnumber = ?");
                      pr.setString(1, "1234");
                       ResultSet set=pr.executeQuery(); 
                      while(set.next()){
                          
                         lastDate = set.getDate("lastDate");

                      }
                      
                      
                   con.close();  
                   pr.close();
                   set.close();
                   }
                   catch(       ClassNotFoundException | SQLException e){ System.out.println(e);}  
        
                                
                                System.out.println("last date "+ lastDate + " in function");
                                return lastDate;
                            }
     
     Boolean checkStatus(){
     int status = 0;
                   try{  
                       Class.forName("com.mysql.jdbc.Driver");
                       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minor","root","root");  
                      PreparedStatement pr = con.prepareStatement("SELECT * FROM userLogin WHERE cardnumber = ?");
//                      pr.setString(1, AtmPin.cardNumber);
                      pr.setString(1, "1234");

                       ResultSet set=pr.executeQuery(); 
                      while(set.next()){
                        
                         status = set.getInt("state");
                      }
                   con.close();  
                   pr.close();
                   set.close();
                  
                   }
                   catch(Exception e){ System.out.println(e);
                   
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
     
                            public static void main(String[] args) {
                                                test t = new test();
//                                                 long millis=System.currentTimeMillis();  
//                                                 Date date1=new java.sql.Date(millis);  
//                                                 System.out.println("Date 1:"+date1);  
//                                                 Date lastDate = t.checkLastDate();
//                                                 
//                                                 System.out.println("Date 2:"+lastDate);
//                                                 
//                                                 System.out.println(date1.compareTo(lastDate));
//                                                 String date1s = String.valueOf(date1);
//                                                 String lastDates = String.valueOf(date1);
//
//                                                  if(date1s.equals(lastDates))
//                                                        System.out.println("Ye chalega kyuki true h");  
//    	
//                                                  if(!date1s.equals(lastDates))
//                                                      System.out.println("Ye chalne ka chance hi nhi h");  
//    	
//                                                  else
//                                                      System.out.println("Ye isliye chala kyuki if vala galat tha");
                                            Boolean flag = t.checkStatus();
                                            if(flag)
                                                System.out.println("Card blocked");
                                            
                                            else
                                                System.out.println("Card is not blocked");
                                                    
    
                
    }
    
}
