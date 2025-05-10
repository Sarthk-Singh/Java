//count vowels in a string
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.temporal.JulianFields;

import javax.swing.*;

class countVowels extends JFrame implements ActionListener
{
    JButton count,reset,exit;
    JTextField str,res;
    countVowels()
    {
        JLabel l1 = new JLabel("Enter a string:");
        str=new JTextField(20);
        JLabel l2 = new JLabel("Result:");
        res=new JTextField(20);

        count=new JButton("Count Vowels");
        reset=new JButton("Reset");
        exit=new JButton("Exit");

        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(l1);
        add(str);
        add(l2);
        add(res);
        count.addActionListener(this);
        reset.addActionListener(this);
        exit.addActionListener(this);
        add(count);
        add(reset);
        add(exit);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==count)
        {
            int count=0,i=0;
            String s=str.getText().toLowerCase();
            int l=s.length();
            while(i<l)
            {
                if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
                    count++;
                i++;
            }
            res.setText(String.valueOf(count));
        }
        if(e.getSource()==reset)
        {
            res.setText("");
        }
        if(e.getSource()==exit)
        {
            System.exit(0);
        }
    }
    public static void main(String args[])
    {
        countVowels cv=new countVowels();
        cv.setSize(300,400);
        cv.setVisible(true);
    }
}  