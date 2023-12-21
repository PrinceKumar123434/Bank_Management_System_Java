package mypack;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class BalanceEnquiry extends JFrame implements ActionListener
{
     JButton back;
    String pinnumber;
 BalanceEnquiry(String pinnumber)
 {
    this.pinnumber=pinnumber;
    setLayout(null);
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
    Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel image=new JLabel(i3);
    image.setBounds(0,0,900,900);
    add(image); 
    
    back = new JButton("Back");
    back.setBounds(355,520,150,30);
    back.addActionListener(this);
    image.add(back);

        Connection_jdbc c=new Connection_jdbc();  
       int balance =0;   
      try
    {
   
      ResultSet rs=c.s.executeQuery("select * from deposit where pin = '"+pinnumber+"'");
         while(rs.next())
         {
             if(rs.getString("type").equals("Deposit"))
             {
              balance +=Integer.parseInt( rs.getString("amount"));
             }   
             else 
             {
                 balance-=Integer.parseInt(rs.getString("amount"));
             }
         }   
    }
    catch(Exception e)
    {
       System.out.println(e);
    }   
    JLabel text1=new JLabel("Your Current Amount balance is Rs "+ balance );
    text1.setBounds(170,300,400,30);
    text1.setForeground(Color.WHITE);
    image.add(text1);
    
   setSize(900,900);
   setLocation(300,0);
   setUndecorated(true);
   setVisible(true);
 }   
public static void main(String arg[])
{
    new BalanceEnquiry("");
}       

    @Override
    public void actionPerformed(ActionEvent e) 
    {
      setVisible(false);
       new Transaction(pinnumber).setVisible(true);      
    }
}
