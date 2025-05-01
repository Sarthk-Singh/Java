import java.awt.*;
import javax.swing.*;

class drawRobot extends Canvas
{
    public void paint(Graphics g)
    {
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
        //g.drawString("Hello Java!!");
        //g.drawLine(50,60,250,270);
        //g.drawOval(100, 120, 150, 160);
        //g.fillOval(100,120,150,160);
        //g.drawArc(0, 120, 150, 160, 0, 90);
        //g.fillArc(0, 120, 150, 160, 0, 90);
        //g.drawPolygon(null);
        g.setColor(Color.GRAY);
        g.fillRect(100, 50, 100, 100);//face
        g.setColor(Color.BLACK);
        g.fillOval(120, 70, 20, 20);//left eye
        g.fillOval(160, 70, 20, 20);//right eye
        g.drawArc(100, 50, 100, 75, 225, 90);//smile
        g.drawRect(50, 150, 200, 200);//body
        g.fillRect(25, 200, 25, 50);//left arm
        g.fillRect(250, 200, 25, 50);//right arm
    }
    public static void main(String args[])
    {
        drawRobot ob=new drawRobot();
        JFrame f=new JFrame();
        f.add(ob);
        f.setSize(400,500);
        f.setVisible(true);
    }
}
