
package mypack;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class PinChange extends JFrame implements ActionListener
{
    JPasswordField pin,repin;
    JButton change,back;
    String pinnumber;
    public PinChange(String pinnumber) 
    {
    this.pinnumber=pinnumber;
    setLayout(null);
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
    Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel image=new JLabel(i3);
    image.setBounds(0,0,900,900);
    add(image); 
    
    JLabel text=new JLabel("CHANGE YOUR PIN");
    text.setBounds(250,300,700,15);
    text.setForeground(Color.WHITE);
    text.setFont(new Font("Raleway",Font.BOLD,15));
    image.add(text);
    
    JLabel pintext=new JLabel("NEW PIN:");
    pintext.setBounds(165,320,150,25);
    pintext.setForeground(Color.WHITE);
    pintext.setFont(new Font("Raleway",Font.BOLD,15));
    image.add(pintext);
    
    pin=new JPasswordField();
    pin.setFont(new Font("Raleway",Font.BOLD,25));
    pin.setBounds(330,320,150,25);
    image.add(pin);
    
    JLabel repintext=new JLabel("Re-Enter New PIN:");
    repintext.setBounds(165,360,150,25);
    repintext.setForeground(Color.WHITE);
    repintext.setFont(new Font("Raleway",Font.BOLD,15));
    image.add(repintext);
    
    repin=new JPasswordField();
    repin.setFont(new Font("Raleway",Font.BOLD,25));
    repin.setBounds(330,360,150,25);
    image.add(repin);
    
     
    change = new JButton("CHANGE");
    change.setBounds(355,485,150,30);
    change.addActionListener(this);
    image.add(change);
    
    back = new JButton("Back");
    back.setBounds(355,520,150,30);
    back.addActionListener(this);
    image.add(back);
    
   setSize(900,900);
   setLocation(300,0);
   setUndecorated(true);
   setVisible(true);
    }
    
     @Override
    public void actionPerformed(ActionEvent ae) 
    {
        if(ae.getSource() ==change)
        {    
    try
    {
     String npin =pin.getText();
     String rpin=repin.getText();
     
     if(!npin.equals(rpin))
     {
     JOptionPane.showMessageDialog(null,"Your pin does not match!" ); 
     return;
     }  
     if(npin.equals(""))
     {
     JOptionPane.showMessageDialog(null,"Please enter new pin" ); 
     return;    
     } 
      if(rpin.equals(""))
     {
     JOptionPane.showMessageDialog(null,"Please re-enter new pin" ); 
     return;    
     } 
      Connection_jdbc c=new Connection_jdbc();
       String query1="update deposit set pin='"+rpin+"'where pin='"+pinnumber+"'";
       String query2="update login set pin='"+rpin+"'where pin='"+pinnumber+"'";
       String query3="update signupthree set pin='"+rpin+"'where pin='"+pinnumber+"'";
      
        c.s.executeUpdate(query1);
         c.s.executeUpdate(query2);
          c.s.executeUpdate(query3);
      JOptionPane.showMessageDialog(null,"Pin changed successfully" );      
       setVisible(false);
       new Transaction(rpin).setVisible(true);  
    }
    catch(Exception e)
    {
        System.out.println(e);
    }    
    }
        else 
        {
         setVisible(false);
         new Transaction(pinnumber).setVisible(true);
        }        
}
public static void main(String arg[])
{
    new PinChange("").setVisible(true);
}       
}