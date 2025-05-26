package Swing_Basics;

import javax.swing.*;
import java.awt.*;

public class Grid_Layout_Example {
    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        jframe.setLayout(new GridLayout(2, 2, 1, 1));
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jframe.setSize(300,400);
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");

        jframe.setVisible(true);
        jframe.add(b1);
        jframe.add(b2);
        jframe.add(b3);
        jframe.add(b4);
    }
}
