import java.sql.*;
import java.io.*;

class selectExample {
public static void main (String args[])
  throws SQLException, IOException {
  try {
    Class.forName("oracle.jdbc.driver.OracleDriver");

} catch (ClassNotFoundException e) {
 System.out.println("Could not load the driver");
  }
   
  Connection  con=DriverManager.getConnection
   ("jdbc:oracle:thin:@localhost:1521:xe","castro","castro" +
   		"");

   Statement stmt=con.createStatement();
   ResultSet cust=stmt.executeQuery
    ("Select cname, city, discnt FROM customers");
     while (cust.next ()) {
     System.out.println("Customer: "+cust.getString(1)+ " Discnt: "+cust.getString(3));
   }
                                
   stmt.close();
   con.close();
}
}


   
