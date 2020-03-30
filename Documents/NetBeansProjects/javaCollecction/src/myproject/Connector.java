package myproject;

import java.sql.*;

public class Connector {
    
static Connection con; 
ResultSet rs;
Statement st;
private static String drivername="com.mysql.jdbc.Driver";
private static String url="jdbc:mysql://localhost:3306/vijay";
private static String username="root";
private static String password="a";

   
    public static Connection getConnection() throws Exception
{

   Class.forName(drivername);
   con=DriverManager.getConnection(url,username,password);
   return con;
    
}

}
