package mypack;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
public class Signup_1 extends JFrame implements ActionListener
{
    long random;
    JTextField nameTextField,fnameTextField,mnameTextField,emailTextField, phoneTextField,addressTextField,cityTextField,stateTextField,pinTextField;
    JButton next;
    JRadioButton male,female,others,married,unmarried,other;
    JDateChooser dateChooser;
    Signup_1()
    {
     setLayout(null);   
     Random ram = new Random();
     random =Math.abs((ram.nextLong() %9000L) +1000L);
     
     JLabel formno = new JLabel("APPLICATION FORM NO: " +random);   
     formno.setFont(new Font("Raleway",Font.BOLD,35));
     formno.setBounds(140, 20, 600, 40);
     add(formno);
     
     JLabel personal = new JLabel("Page 1: Personal Details" );   
     personal.setFont(new Font("Raleway",Font.BOLD,22));
     personal.setBounds(290, 80, 400, 30);
     add(personal);
     
     JLabel name = new JLabel("Name:" );   
     name.setFont(new Font("Raleway",Font.BOLD,20));
     name.setBounds(100, 140, 100, 30);
     add(name);
     nameTextField = new JTextField();
     nameTextField.setFont(new Font("Raleway" ,Font.BOLD,15));
     nameTextField.setBounds(300, 140, 400, 30);
     add(nameTextField);
     
     JLabel fname = new JLabel("Father's name:" );   
     fname.setFont(new Font("Raleway",Font.BOLD,20));
     fname.setBounds(100, 190, 200, 30);
     add(fname);
     fnameTextField = new JTextField();
     fnameTextField.setFont(new Font("Raleway" ,Font.BOLD,15));
     fnameTextField.setBounds(300, 190, 400, 30);
     add(fnameTextField);
     
     JLabel mname = new JLabel("Mother's name:" );   
     mname.setFont(new Font("Raleway",Font.BOLD,20));
     mname.setBounds(100, 240, 200, 30);
     add(mname);
     mnameTextField = new JTextField();
     mnameTextField.setFont(new Font("Raleway" ,Font.BOLD,15));
     mnameTextField.setBounds(300, 240, 400, 30);
     add(mnameTextField);
     
     JLabel dob = new JLabel("Date of Birth:" );   
     dob.setFont(new Font("Raleway",Font.BOLD,20));
     dob.setBounds(100, 290, 200, 30);
     add(dob);
     dateChooser = new JDateChooser();
     dateChooser.setBounds(300 ,290,400, 30);
     dateChooser.setForeground(Color.red);
     add(dateChooser);
     
     JLabel gender = new JLabel("Gender:" );   
     gender.setFont(new Font("Raleway",Font.BOLD,20));
     gender.setBounds(100, 340, 200, 30);
     add(gender);
     male=new JRadioButton("Male");
     male.setBounds(300, 340, 60, 30);
     male.setBackground(Color.WHITE);
     add(male);
     female=new JRadioButton("Female");
     female.setBounds(420, 340, 120, 30);
     female.setBackground(Color.WHITE);
     add(female);
     others=new JRadioButton("Other");
     others.setBounds(580, 340, 120, 30);
     others.setBackground(Color.WHITE);
     add( others);
     ButtonGroup gendergroup = new ButtonGroup();
     gendergroup.add(male);
     gendergroup.add(female);
     gendergroup.add(others);
     
     JLabel email = new JLabel("Email Address:" );   
     email.setFont(new Font("Raleway",Font.BOLD,20));
     email.setBounds(100, 390, 200, 30);
     add(email);
     emailTextField = new JTextField();
     emailTextField.setFont(new Font("Raleway" ,Font.BOLD,15));
     emailTextField.setBounds(300, 390, 400, 30);
     add(emailTextField);
     
     JLabel pnumbar = new JLabel("Phone Number:" );   
     pnumbar.setFont(new Font("Raleway",Font.BOLD,20));
     pnumbar.setBounds(100, 440, 200, 30);
     add(pnumbar);
     phoneTextField = new JTextField();
     phoneTextField.setFont(new Font("Raleway" ,Font.BOLD,15));
     phoneTextField.setBounds(300, 440, 400, 30);
     add( phoneTextField);
     
     JLabel marital = new JLabel("Marital Status:" );   
     marital.setFont(new Font("Raleway",Font.BOLD,20));
     marital.setBounds(100, 490, 200, 30);
     add(marital);
     
     married=new JRadioButton("Married");
     married.setBounds(300, 490, 100, 30);
     married.setBackground(Color.WHITE);
     add(married);
     
     unmarried=new JRadioButton("Unmarried");
     unmarried.setBounds(450, 490, 100, 30);
     unmarried.setBackground(Color.WHITE);
     add(unmarried);
     
     other=new JRadioButton("Other");
     other.setBounds(600, 490, 100, 30);
     other.setBackground(Color.WHITE);
     add(other);
     
     ButtonGroup maritalgroup = new ButtonGroup();
     maritalgroup.add(married);
     maritalgroup.add(unmarried);
     maritalgroup.add(other);
     
     
     
     JLabel add = new JLabel("Address:" );   
     add.setFont(new Font("Raleway",Font.BOLD,20));
     add.setBounds(100, 540, 200, 30);
     add(add);
     addressTextField = new JTextField();
     addressTextField.setFont(new Font("Raleway" ,Font.BOLD,15));
     addressTextField.setBounds(300, 540, 400, 30);
     add(addressTextField);
     
     JLabel city = new JLabel("City:" );   
     city.setFont(new Font("Raleway",Font.BOLD,20));
     city.setBounds(100, 590, 200, 30);
     add(city);
     cityTextField = new JTextField();
     cityTextField.setFont(new Font("Raleway" ,Font.BOLD,15));
     cityTextField.setBounds(300, 590, 400, 30);
     add(cityTextField);
     
     JLabel state = new JLabel("State:" );   
     state.setFont(new Font("Raleway",Font.BOLD,20));
     state.setBounds(100, 640, 200, 30);
     add(state);
     stateTextField = new JTextField();
     stateTextField.setFont(new Font("Raleway" ,Font.BOLD,15));
     stateTextField.setBounds(300, 640, 400, 30);
     add(stateTextField);
     
     JLabel pin = new JLabel("Pin code:" );   
     pin.setFont(new Font("Raleway",Font.BOLD,20));
     pin.setBounds(100, 690, 200, 30);
     add(pin);
     pinTextField = new JTextField();
     pinTextField.setFont(new Font("Raleway" ,Font.BOLD,15));
     pinTextField.setBounds(300, 690, 400, 30);
     add(pinTextField);
     
     next = new JButton("Next");
     next.setBackground(Color.BLACK);
     next.setForeground(Color.WHITE);
     next.setFont(new Font("Raleway",Font.BOLD,14));
     next.setBounds(620,750,80,30);
     next.addActionListener(this);
     add(next);
     
     getContentPane().setBackground(Color.WHITE);
     setSize(830,900);
     setLocation(350,10);
     setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
      String formno=" " + random;
      String name=nameTextField.getText();
      String fname=fnameTextField.getText();
      String mname=mnameTextField.getText();
      String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
      String gender=null;
      if(male.isSelected())
      {
          gender="male";
      }
      else if(female.isSelected())
      {
          gender="female";
      }
      else if(others.isSelected())
      {
        gender="others";  
      }   
      String email=emailTextField.getText();
      String phone=phoneTextField.getText();
      String marital=null;
      if(married.isSelected())
      {
          marital="married";
      }
      else if(unmarried.isSelected())
      {
          marital="unmarried";
      }
      else if(other.isSelected())
      {
          marital="other";
      }
      
      String address=addressTextField.getText();
      String city=cityTextField.getText();
      String state=stateTextField.getText();
      String pin=pinTextField.getText();
      
      try
      {
        
      if(name.equals(""))
      {
          JOptionPane.showMessageDialog(null, "Name is Required");
      }
      else if(name.length()<3)
      {
       JOptionPane.showMessageDialog(null, "Name must be 3 character");   
      }  
       else if(name.length()>30)
      {
       JOptionPane.showMessageDialog(null, "Name must be less than 30 character");   
      } 
     
           
      if(fname.equals(""))
      {
          JOptionPane.showMessageDialog(null, "Father's Name is Required");
      }
      else if(fname.length()<3)
      {
       JOptionPane.showMessageDialog(null, "Father's Name must be 3 character");   
      }  
       else if(fname.length()>30)
      {
       JOptionPane.showMessageDialog(null, "Father's Name must be less than 30 character");   
      } 
      
         if(mname.equals(""))
      {
          JOptionPane.showMessageDialog(null, " Mother's name is Required");
      }
      else if(mname.length()<3)
      {
       JOptionPane.showMessageDialog(null, " Mother's name must be 3 character");   
      }  
       else if(mname.length()>30)
      {
       JOptionPane.showMessageDialog(null, " Mother's name must be less than 30 character");   
      } 
       
     
             
      if(dob.equals(""))
      {
          JOptionPane.showMessageDialog(null, "Date of Birth is Required");
      }
       if(email.equals(""))
      {
          JOptionPane.showMessageDialog(null, "Email is Required");
      }
       
        if(phone.equals(""))
      {
          JOptionPane.showMessageDialog(null, "Phone Number is Required");
      }
        if(address.equals(""))
      {
          JOptionPane.showMessageDialog(null, "Address is Required");
      }
         if(city.equals(""))
      {
          JOptionPane.showMessageDialog(null, "City is Required");
      }
          if(state.equals(""))
      {
          JOptionPane.showMessageDialog(null, "State is Required");
      }
           if(pin.equals(""))
      {
          JOptionPane.showMessageDialog(null, "Pin number is Required");
      }
      
         
      else 
      {
          Connection_jdbc c=new Connection_jdbc();
          String query="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+mname+"','"+dob+"','"+gender+"','"+email+"','"+phone+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
          c.s.executeUpdate(query);
          setVisible(false);
          new Signup_2(formno).setVisible(true);
      }
      }  
      catch(Exception e)
      {
         System.out.println(e);
      }   
      
    }
    
 public static void main(String arg[])
 {
  new Signup_1();   
 }        
}
