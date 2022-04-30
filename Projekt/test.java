package Projekt;

import javax.swing.*;
import java.awt.*;

public class test extends JFrame {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton button = new JButton("elo");
    test(){
        setSize(700,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        button.setBounds(10,10,50,50);

        panel.add(button);
        add(panel);


        setVisible(true);
    }

    public void paint(Graphics g) {
        int x=50;
        int y=50;
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        Stroke stroke = new BasicStroke(5f);
        g2d.setStroke(stroke);
        g2d.setColor(Color.RED);
        g2d.drawLine(x+50, y+20, x+50, y+50);
//        g2d.drawLine(x+100, y+20, x+50, y+50);
//        g2d.drawLine(x+200, y+50, x, y+50);
//        g2d.drawLine(x+250, y+300, x+50, y);


       for (int i=0; i<10;i++) {
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               System.out.println("error");
           }

           g2d.drawLine(i*x, 50, i*x, 50);
        }
    }

    public static void main(String [] args){
        test test = new test();

    }
}
