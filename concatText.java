// concat 2 text in text fields
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class concatText extends JFrame implements ActionListener
{
    JLabel text1,text2,result;
    JTextField tb1,tb2,res;
    concatText()
    {
        text1=new JLabel("First Name: ");
        tb1=new JTextField(20);
        
        text2=new JLabel("Last Name: ");
        tb2=new JTextField(20);
        
        result=new JLabel("Result: ");
        res=new JTextField(20);
        
        JButton concat=new JButton("CONCAT");
        
        
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(text1);
        add(tb1);
        add(text2);
        add(tb2);
        add(result);
        add(res);
        add(concat);
        concat.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        res.setText(tb1.getText()+tb2.getText());
    }
    public static void main(String args[])
    {
        concatText ct=new concatText();
        ct.setSize(300,400);
        ct.setVisible(true);
    }
}