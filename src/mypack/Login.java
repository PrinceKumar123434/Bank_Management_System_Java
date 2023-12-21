
package mypack;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener
{
    JButton login,signup,clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    
    Login()
    {
     setTitle("AUTOMATIC TELER MACHIEN");
     setLayout(null);
     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/logo.jpg"));
     Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
     ImageIcon i3=new ImageIcon(i2);
     JLabel label=new JLabel(i3);
     label.setBounds(70,10,100,100);
     add(label);
     
     JLabel text=new JLabel("Welcome to ATM");
     text.setFont(new Font("Osward",Font.BOLD,38));
     text.setBounds(200,40,400,40);
     text.setForeground(Color.BLACK);
     add(text);
     
     JLabel Cardno=new JLabel("Card No.");
     Cardno.setFont(new Font("Raleway",Font.BOLD,28));
     Cardno.setBounds(120,160,150,30);
     Cardno.setForeground(Color.BLACK);
     add(Cardno);
     cardTextField = new JTextField();
     cardTextField.setBounds(300,150,230,30);
     cardTextField.setFont(new Font("Arial",Font.BOLD,18));
     add(cardTextField);
     
     JLabel pin=new JLabel("PIN:");
     pin.setFont(new Font("Raleway",Font.BOLD,28));
     pin.setBounds(120,220,230,30);
     pin.setForeground(Color.BLACK);
     add(pin);
     pinTextField = new     JPasswordField();
     pinTextField.setBounds(300,220,230,30);
     pinTextField.setFont(new Font("Arial",Font.BOLD,18));
     add(pinTextField);
     
     login = new JButton("SIGN IN");
     login.setBounds(300,300,100,30);
     login.setBackground(Color.BLACK);
     login.setForeground(Color.white);
     login.setFont(new Font("Raleway",Font.BOLD, 15));
     login.addActionListener(this);
     add(login);
     
     clear = new JButton("CLEAR");
     clear.setBounds(430,300,100,30);
     clear.setBackground(Color.BLACK);
     clear.setForeground(Color.white);
     clear.setFont(new Font("Raleway",Font.BOLD, 15));
     clear.addActionListener(this);
     add(clear);
     
     signup = new JButton("SIGN UP");
     signup.setBounds(300,350,230,30);
     signup.setBackground(Color.BLACK);
     signup.setForeground(Color.white);
     signup.setFont(new Font("Raleway",Font.BOLD, 15));
     signup.addActionListener(this);
     add(signup);
     
     getContentPane().setBackground(Color.WHITE);
     setSize(800,600);
     setVisible(true);
     setLocation(350,200);
     
    }        
public static void main(String arg[])
{
  new Login(); 
}       

    @Override
    public void actionPerformed(ActionEvent ee)
    {
      if(ee.getSource() ==clear)
      {
       cardTextField.setText("");   
       pinTextField.setText("");  
      }   
      else if(ee.getSource()== login)
      {
       Connection_jdbc c=new Connection_jdbc();
       String cardnumber=cardTextField.getText();
       String pinnumber=pinTextField.getText();
      String query="select * from login where cardnumber ='"+cardnumber+"' and pin ='"+pinnumber+"' ";
      try
      {
      ResultSet rs=  c.s.executeQuery(query);  
      if(rs.next())
      {
         setVisible(false);
         new Transaction(pinnumber).setVisible(true);
      }
      else 
      {
          JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
      }
      }   
      catch(Exception e)
      {
         e.getMessage();
      }    
      }   
      else if(ee.getSource() == signup)
      {
        setVisible(false);
        new Signup_1().setVisible(true);
      }
    }
}
