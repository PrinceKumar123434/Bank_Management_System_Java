package mypack;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Signup_2 extends JFrame implements ActionListener
{
    JTextField pan,aadhar;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox  religion,categery,occupation, education,income;
    String formno;
    
    Signup_2(String formno)
    {
        this.formno=formno;
     setLayout(null);   
     
     setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
     
     JLabel additionalDetails = new JLabel("Page 2: Additional Details" );   
     additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
     additionalDetails.setBounds(290, 80, 400, 30);
     add(additionalDetails);
     
     JLabel name = new JLabel("Religion:" );   
     name.setFont(new Font("Raleway",Font.BOLD,20));
     name.setBounds(100, 140, 100, 30);
     add(name);
     String valReligion[]={"Hindu","Muslim","Sikh","Christion","Other"};
     religion = new JComboBox(valReligion);
     religion.setBounds(300, 140, 400, 30);
     religion.setBackground(Color.WHITE);
     add(religion);
     
     JLabel fname = new JLabel("Category:" );   
     fname.setFont(new Font("Raleway",Font.BOLD,20));
     fname.setBounds(100, 190, 200, 30);
     add(fname);
     String valcategery[]={"General","OBC","SC","ST","Other"};
     categery = new JComboBox(valcategery);
     categery .setBounds(300, 190, 400, 30);
     categery.setBackground(Color.WHITE);
     add(categery );
       
     JLabel dob = new JLabel("Income:" );   
     dob.setFont(new Font("Raleway",Font.BOLD,20));
     dob.setBounds(100, 240, 200, 30);
     add(dob);
     String valincome[]={"null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
     income = new JComboBox(valincome);
     income.setBounds(300 ,240,400, 30);
     income.setBackground(Color.WHITE);
     add(income );
    
     JLabel email = new JLabel("Qualification:" );   
     email.setFont(new Font("Raleway",Font.BOLD,20));
     email.setBounds(100, 290,200, 30);
     add(email);
     String educationvalues[]={"Non-Graduation","Graduate","Post-Graduation","Doctrate","Other"};
     education = new JComboBox(educationvalues);
     education .setBounds(300, 290, 400, 30);
     education.setBackground(Color.WHITE);
     add(education );
       
     JLabel marital = new JLabel("Occupation:" );   
     marital.setFont(new Font("Raleway",Font.BOLD,20));
     marital.setBounds(100, 340, 200, 30);
     add(marital);
     String occupationvalues[]={"Salarid","Self-Employed","Bussiness","Student","Retired","Other"};
     occupation = new JComboBox(occupationvalues);
     occupation .setBounds(300, 340, 400, 30);
     occupation.setBackground(Color.WHITE);
     add(occupation );
     
     JLabel add = new JLabel("PAN Number:" );   
     add.setFont(new Font("Raleway",Font.BOLD,20));
     add.setBounds(100, 390, 200, 30);
     add(add);
     pan = new JTextField();
     pan.setFont(new Font("Raleway" ,Font.BOLD,15));
     pan.setBounds(300, 390, 400, 30);
     add(pan);
     
     JLabel city = new JLabel("Aadhar Number:" );   
     city.setFont(new Font("Raleway",Font.BOLD,20));
     city.setBounds(100, 440, 200, 30);
     add(city);
     aadhar = new JTextField();
     aadhar.setFont(new Font("Raleway" ,Font.BOLD,15));
     aadhar.setBounds(300, 440, 400, 30);
     add(aadhar);
     
     JLabel state = new JLabel("Senior Citizen:" );   
     state.setFont(new Font("Raleway",Font.BOLD,20));
     state.setBounds(100, 490, 200, 30);
     add(state);
     syes=new JRadioButton("yes");
     syes.setBounds(300,490,100,30);
     syes.setBackground(Color.WHITE);
     add(syes);
     sno=new JRadioButton("no");
     sno.setBounds(450,490,100,30);
     sno.setBackground(Color.WHITE);
     add(sno);
     
     ButtonGroup seniorc =new ButtonGroup();
     seniorc.add(syes);
     seniorc.add(sno);
     
     JLabel pin = new JLabel("Exisiting Account:" );   
     pin.setFont(new Font("Raleway",Font.BOLD,20));
     pin.setBounds(100, 540, 200, 30);
     add(pin);
    
     eyes=new JRadioButton("yes");
     eyes.setBounds(300,540,100,30);
     eyes.setBackground(Color.WHITE);
     add(eyes);
     eno=new JRadioButton("no");
     eno.setBounds(450,540,100,30);
     eno.setBackground(Color.WHITE);
     add(eno);
     
     ButtonGroup existionc =new ButtonGroup();
     existionc.add(eyes);
     existionc.add(eno);
     
     next = new JButton("Next");
     next.setBackground(Color.BLACK);
     next.setForeground(Color.WHITE);
     next.setFont(new Font("Raleway",Font.BOLD,14));
     next.setBounds(620,600,80,30);
     next.addActionListener(this);
     add(next);
     
     getContentPane().setBackground(Color.WHITE);
     setSize(800,750);
     setLocation(350,10);
     setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
      String sreligion=(String) religion.getSelectedItem();
      String scategery=(String)categery.getSelectedItem();
      String sincome=(String)income.getSelectedItem();
      String seducation=(String)education.getSelectedItem();
      String soccupation=(String)occupation.getSelectedItem();
      String seniorcitizen=null;
      if(syes.isSelected())
      {
          seniorcitizen="Yes";
      }
      else if(sno.isSelected())
      {
          seniorcitizen="No";
      }
      
      String exisitingaccount=null;
      if(eyes.isSelected())
      {
          exisitingaccount="Yes";
      }
      else if(eno.isSelected())
      {
          exisitingaccount="No";
      }
     
      String span=pan.getText();
      String saadhar=aadhar.getText();
      
       if(span.equals(""))
      {
          JOptionPane.showMessageDialog(null, "Pan number is Required");
      }
       if(saadhar.equals(""))
      {
          JOptionPane.showMessageDialog(null, "Aadhar number is Required");
      }
      
      try
      {
          Connection_jdbc c=new Connection_jdbc();
          String query="insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategery+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+exisitingaccount+"')";
          c.s.executeUpdate(query);
          
          setVisible(false);
          new Signup_3(formno).setVisible(true);
      }  
      catch(Exception e)
      {
         System.out.println(e);
      }   
      
    }
    
 public static void main(String arg[])
 {
  new Signup_2("");   
 }        
}

