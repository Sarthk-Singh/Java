//multiple buttons
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class calculator extends JFrame implements ActionListener 
{
    JLabel n1,n2,result;
    JTextField tf1,tf2,res;
    JButton b1,b2,b3,b4;
    calculator()
    {
        n1=new JLabel("Number 1: ");
        tf1=new JTextField(20);
        n2=new JLabel("Number 2: ");
        tf2=new JTextField(20);
        result=new JLabel("Result: ");
        res=new JTextField(20);
        
        b1=new JButton("ADD");
        b2=new JButton("SUBTRACT");
        b3=new JButton("CLEAR");
        b4=new JButton("EXIT");

        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(n1);
        add(tf1);
        add(n2);
        add(tf2);
        add(result);
        add(res);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            int num1=Integer.parseInt(tf1.getText());
            int num2=Integer.parseInt(tf2.getText());
            int sum=num1+num2;
            res.setText(String.valueOf(sum));
        }
        if(e.getSource()==b2)
        {
            int num1=Integer.parseInt(tf1.getText());
            int num2=Integer.parseInt(tf2.getText());
            int sum=num1-num2;
            res.setText(String.valueOf(sum));
        }
        if(e.getSource()==b3)
        {
            res.setText("");
        }
        if(e.getSource()==b4)
        {
            System.exit(0);
        }
    }
    public static void main(String[] args)
    {
        calculator c=new calculator();
        c.setSize(300,400);
        c.setVisible(true);
    }
}