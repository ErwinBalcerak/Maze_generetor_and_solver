package Projekt;

import javax.swing.*;
import java.awt.*;

public class test3 extends JFrame {

    test3(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700,500);
        setLayout(null);
//        test4 panel = new test4();

        JPanel elo = new JPanel();
        elo.setLayout(null);
        elo.setBounds(350,10,300,300);

        elo.setBackground(Color.cyan);


        JButton button = new JButton("e");
        button.setBounds(10,10,100,100);
        elo.add(button);

//        add(panel);

        add(elo);

        JPanel Maze4 = new JPanel();

        Maze4.setLayout(null);
        Maze4.setBounds(10,400,500,500);

        setTitle("Labirynt :-)");

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton GoBack4 = new JButton("wroc");
        GoBack4.setBounds(40,200,200,25);
        GoBack4.setFocusable(false);
        Maze4.add(GoBack4);

        JButton Save_txt = new JButton("ZAPISZ TXT");
        Save_txt.setBounds(40,10,200,25);
        Save_txt.setFocusable(false);
        Maze4.add(Save_txt);

//        Save_image_generated.setBounds(40,40,200,25);
//        Save_image_generated.setFocusable(false);
//        Maze4.add(Save_image_generated);
//
//        Solve.setBounds(40,70,200,25);
//        Solve.setFocusable(false);
//        Maze4.add(Solve);
//
//        ShowSolve.setBounds(40,100,200,25);
//        ShowSolve.setFocusable(false);
//        Maze4.add(ShowSolve);

        add(Maze4);

//        repaint();
        setVisible(true);
    }

    public static void main(String [] args) {
        test3 test33 = new test3();



    }

}
