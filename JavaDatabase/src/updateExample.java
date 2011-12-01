import java.sql.*;
import java.io.*;

class updateExample {
public static void main (String args[])
  throws SQLException, IOException {
  try {
    Class.forName("oracle.jdbc.driver.OracleDriver");

} catch (ClassNotFoundException e) {
 System.out.println("Could not load the driver");
  }
  
  Connection  con=DriverManager.getConnection
   ("jdbc:oracle:thin:@localhost:1521:xe","castro","castro");
	
	System.out.println("We're going to update the discount rate for all customers\n");
	System.out.println("Here are the original discount rates before the update statement\n");
	
	Statement stmt=con.createStatement();
   ResultSet cust=stmt.executeQuery
    ("Select cname, discnt FROM customers");
     while (cust.next ()) {
     System.out.println("Customer: "+cust.getString(1)+ "\t\tDiscnt: "+cust.getString(2));
   }


	System.out.println("Now, we're going to run the following UPDATE query:\n");
	System.out.println("UPDATE customers SET discnt = discnt + 1");

   stmt=con.createStatement();
   stmt.executeUpdate ("Update customers set discnt = discnt + 1");

   
   System.out.println("\t\nRecords Updated\n");

   cust=stmt.executeQuery
    ("Select cname, discnt  FROM customers");
     while (cust.next ()) {
     System.out.println("Customer: "+cust.getString(1)+ "\t\tDiscnt: "+cust.getString(2));
   }
                                
   stmt.close();
   con.close();
}
}



   
