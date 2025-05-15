//state changes for multiple elements in the frame

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class stateChanges extends JFrame implements ActionListener
{
    JButton submit,exit;
    JTextField name,age;
    JRadioButton male,female;
    JTextArea msg;
    stateChanges()
    {
        setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel l1=new JLabel("Name: ");
        JTextField name=new JTextField(20);
        add(l1);
        add(name);

        JLabel l2=new JLabel("Age: ");
        JTextField age=new JTextField(20);
        add(l2);
        add(age);
        
        male=new JRadioButton("Male");
        female=new JRadioButton("Female");
        ButtonGroup bg=new ButtonGroup();
        bg.add(male);
        bg.add(female);
        add(male);
        add(female);

        
        JLabel l3=new JLabel("Message: ");
        msg=new JTextArea(20,20);
        add(l3);
        add(msg);
        
        submit=new JButton("SUBMIT");
        add(submit);
        exit=new JButton("EXIT");
        add(exit);
        submit.addActionListener(this);
        exit.addActionListener(this);
        male.addActionListener(this);
        female.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        
        if(e.getSource()==submit)
        {
            int age1=Integer.parseInt(age.getText());
            if(age1>=18)
            {
                if(e.getSource()==male)
                {
                    msg.setText("Male VOTE");
                }
                else if(e.getSource()==female)
                {
                    msg.setText("Female VOTE");
                }
            }
            else
                msg.setText("You cannot VOTE");
        }
        if(e.getSource()==exit)
        {
            System.exit(0);
        }
    }
    public static void main(String[] args)
    {
        stateChanges frame = new stateChanges();
        frame.setSize(300, 500);
        frame.setTitle("State Changes");
        frame.setVisible(true);
    }
}