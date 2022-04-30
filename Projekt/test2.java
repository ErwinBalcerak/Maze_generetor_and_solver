package Projekt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class test2 extends JPanel implements ActionListener {

    private final static int panel_size=700;
    private final static Color COLOR=Color.BLUE;
    private final static Color Background_Color=Color.WHITE;
    private final static int Stroke_Width=1;

    ArrayList<ArrayList<Integer>> lines = new ArrayList<ArrayList<Integer>>();
    Timer timer = new Timer(1000,this);
    int counter=0;

    public void test2(){
        setBackground(Background_Color);
        timer.start();

        setVisible(true);
    }

    @Override
    public Dimension getPreferredSize(){
        return new Dimension(panel_size,panel_size);
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(COLOR);
        g2d.setStroke(new BasicStroke(Stroke_Width));
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);

        for (ArrayList<Integer> i: lines){
            g2d.drawLine(i.get(0),i.get(1),i.get(2),i.get(3));
        }


//        int x=50;
//        int y=50;
//        for (int i=0; i<10;i++) {
//            g2d.drawLine(i*x, 50, i*x, 50);
//
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                System.out.println("error");
//            }
//        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source==timer){
            if (counter<3){
                int x = counter*50;
                int y = counter*10;
                int x2 = counter*50+50;
                int y2 = counter*10+40;

                ArrayList<Integer> temporarylist= new ArrayList<Integer>();
                temporarylist.add(x);
                temporarylist.add(y);
                temporarylist.add(x2);
                temporarylist.add(y2);
                lines.add(temporarylist);

                repaint();

            } else {
                timer.stop();
            }
            counter+=1;
        }
    }

    public static void main(String [] args) {
        test2 testelo = new test2();
        JFrame elo = new JFrame();
        JPanel panel= new JPanel();
        testelo.paintComponent(panel.getGraphics());
        panel.add(testelo);


//        elo.setSize(700,400);

        elo.add(panel);
        elo.pack();
        elo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        elo.setVisible(true);

    }
}
