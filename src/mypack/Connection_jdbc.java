package mypack;
import java.sql.*;
public class Connection_jdbc 
{
    Connection c;
    Statement s;
public Connection_jdbc()
{
 try
 {
  Class.forName("com.mysql.cj.jdbc.Driver");
  c=DriverManager.getConnection("Jdbc:mysql://localhost:3306/bank","root","");

  s=c.createStatement();
 }   
catch(Exception e)
{
    System.out.println(e);
}  
}       
}
