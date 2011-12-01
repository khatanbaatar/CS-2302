import java.sql.*;
import java.io.*;

class insertExample {
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

     stmt.executeUpdate ("Insert into customers (cid, cname, city, discnt) values " +
                 "('C011','IBM','Atlanta',30)");
   
   System.out.println("\nRow Inserted. Now we'll display the results\n");
	
	cust=stmt.executeQuery
		("Select cname,discnt from customers");
		while (cust.next()) {
			System.out.println("Customer: "+cust.getString(1)+"\t\tDiscnt: "+cust.getString(2));
		}
	System.out.println("\nThe row we added should be present in the data above");
                                
   stmt.close();
   con.close();
}
}


   
