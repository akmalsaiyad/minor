
	//        jdbc:mysql://localhost:3306/akmal
	// 		  C:>set classpath=C:\Users\Lenovo\Downloads\mysql-connector-java-8.0.21-bin.jar;.;  

package minor1;


import java.sql.*;  

public class LoginC{
	
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

                       ResultSet set=stmt.executeQuery("select * from adminLogin");  // firing query by executeQuery. executeUpdate, and a simply execute.

                       while(set.next()){
                               String usernameDB = set.getString("username");
                               String passwordDB = set.getString("password");

                               if (Login.username.equals(usernameDB) && Login.password.equals(passwordDB)){
                                       flag = true;
                       } 
                   }
                   con.close();  
                   stmt.close();
                   set.close();
                   }
                   catch(Exception e){ System.out.println(e);}  
                   return flag;
            }
}
//	public static void main(String [] args){
//                Boolean flag = false;
//		 System.out.println("Bismillah hirrehman nirraheem");
//		 Scanner s = new Scanner(System.in);
//		 System.out.println("Enter username:");
//		 String username = s.next();
//		 System.out.println("Enter password");
//		 String password = s.next();
		// new Login(username,password).check();

//		try{  
//		Class.forName("com.mysql.jdbc.Driver");  // loading the driver
//                // or DriverManager.registerDriver(new com.mysql.jdbc.Driver()); to load the driver
//		
//                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/akmal","root","root");  //creating connection "Connection" is an interface in java.sql class
//                                                           // "url"     servername^ "username","password"
//                //here sonoo is database name, root is username and password  
//		//create query, statement, prepared statement( for statements with ?) , and callablestatement
//                Statement stmt=con.createStatement();  
//		
//                ResultSet set=stmt.executeQuery("select * from Login");  // firing query by executeQuery. executeUpdate, and a simply execute.
//                
//                while(set.next()){
//                    String ad = set.getString("Username");
//                    String ps = set.getString("Password");
//                    if (username.equals("admin") && password.equals("admin")){
//	 		flag = true;
//                    } 
	 	
//                    System.out.print(ad+"\t");
//                    System.out.println(ps);

//                }
//                if(flag == true){
//                System.out.println("Login Successfull!!");
//                System.exit(0);
//                }
//                else{
//                    
//                System.out.println("Login failed!!");
//                System.exit(-1);
//                }
                //close the connection
//		con.close();  
//		}
//		catch(Exception e){ System.out.println(e);}  
//}


