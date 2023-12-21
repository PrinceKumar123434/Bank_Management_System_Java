
package mypack;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
//import java.awt.event.*;

public class MiniStatement  extends JFrame
{
    
 MiniStatement(String pinnumber)
 {
  setTitle("Mini Statement");
  setLayout(null);
  JLabel text=new JLabel();
  add(text);
  
  JLabel mini=new JLabel("");
  mini.setBounds(20,140,400,200);
  add(mini);
  
  JLabel bank=new JLabel("SBI Bank");
  bank.setBounds(150,20,140,20);
  add(bank);
  
  JLabel card=new JLabel("");
  card.setBounds(20,80,300,20);
  add(card);
  
  JLabel balance = new JLabel();
  balance.setBounds(20,400,330,20);
  add(balance);
  
  try
  {
    Connection_jdbc c=new Connection_jdbc();  
     ResultSet rs=  c.s.executeQuery("select * from login where pin ='"+pinnumber+"'");  
    while(rs.next())
    {
        card.setText("Card Number: "+rs.getString("cardnumber").substring(0,4)+"XXXXXXXX"+rs.getString("cardnumber").substring(12));
    }    
  }
  catch(Exception e)
  {
      System.out.println(e);
  }    
  
 try
  {
      int bal=0;
    Connection_jdbc c=new Connection_jdbc();  
     ResultSet rs=  c.s.executeQuery("select * from deposit where pin ='"+pinnumber+"'");  
    while(rs.next())
    {
        mini.setText(mini.getText()+"<html>"+rs.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;"+"&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amount")+"<br><br></html>");
   
         if(rs.getString("type").equals("Deposit"))
             {
              bal +=Integer.parseInt( rs.getString("amount"));
             }   
             else 
             {
                 bal-=Integer.parseInt(rs.getString("amount"));
             }
    }    
    balance.setText("Your current balance is Rs "+bal);
  }
  catch(Exception e)
  {
      System.out.println(e);
  }      
  
   setSize(500,500);
   setLocation(200,20);
  getContentPane().setBackground(Color.WHITE);
   setVisible(true);
 }       
    
public static void main(String arg[])
{
    new MiniStatement("");
}       
}
