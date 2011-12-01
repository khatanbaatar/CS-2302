import java.sql.*;
import java.io.*;

class deleteExample {
public static void main (String args[])
  throws SQLException, IOException {
  try {
    Class.forName("oracle.jdbc.driver.OracleDriver");

} catch (ClassNotFoundException e) {
 System.out.println("Could not load the driver");
  }
 

  Connection  con=DriverManager.getConnection
   ("jdbc:oracle:thin:@localhost:1521:xe","castro","castro");

   Statement stmt=con.createStatement();
   ResultSet cust=stmt.executeQuery
    ("Select cname, discnt  FROM customers");
     while (cust.next ()) {
     System.out.println("Customer:"+cust.getString(1)+ "\t\tDiscnt: "+cust.getString(2));
   }

	System.out.println("\nNow, we're going to delete from the customers table:\n");
	System.out.println("DELETE from customers WHERE cname='IBM'");

     stmt.executeUpdate ("DELETE from customers WHERE cname='IBM'");
   
   System.out.println("\nRow(s) deleted. Now we'll display the results\n");
	
	cust=stmt.executeQuery
		("Select cname,discnt from customers");
		while (cust.next()) {
			System.out.println("Customer: "+cust.getString(1)+"\t\tDiscnt: "+cust.getString(2));
		}
	System.out.println("\nWe should not have any rows with IBM as the cname");
                                
   stmt.close();
   con.close();
}
}


   
