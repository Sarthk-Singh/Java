
//creating a form in java
import javax.swing.*;
import java.awt.*;

class form extends JFrame
{
    public form()
    {
        setLayout(new FlowLayout());

        JLabel l1=new JLabel("Enter your name:");
        JTextField t1=new JTextField(20);
        JLabel l2=new JLabel("Enter your age:");
        JTextField t2=new JTextField(20);
        JLabel l3=new JLabel("Select your section:");
        
        String drop[]={"A","B","C","D","E"};
        JComboBox cb=new JComboBox(drop);

        JLabel l4=new JLabel("Select your course:");
        JCheckBox cb1=new JCheckBox("CSE");
        JCheckBox cb2=new JCheckBox("ECE");
        JCheckBox cb3=new JCheckBox("CIVIL");
        
        JLabel gender=new JLabel("Select your gender:");
        JRadioButton rb1=new JRadioButton("Male");
        JRadioButton rb2=new JRadioButton("Female");
        JRadioButton rb3=new JRadioButton("Other");
        ButtonGroup bg=new ButtonGroup();//add radio buttons to the radio group
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);

        JLabel l5=new JLabel("Table: ");

        JButton b1=new JButton("Submit");
        add (l1);//name
        add(t1);//name bax
        add(l2);//age
        add(t2);//age box
        add(l3);//section
        add(cb);//drop down
        add(l4);//course
        add(cb1);//cse
        add(cb2);//ece
        add(cb3);//civil
        add(rb1);//male
        add(rb2);//female
        add(rb3);//other
        add(b1);//submit button
    }
    public static void main(String args[])
    {
        form f=new form();
        f.setSize(400,300);
        f.setVisible(true);
    }
}