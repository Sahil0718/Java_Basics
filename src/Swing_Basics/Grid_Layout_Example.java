package Swing_Basics;

import javax.swing.*;
import java.awt.*;

public class Grid_Layout_Example extends JFrame {
    public Grid_Layout_Example() {
        setLayout(new GridLayout(2, 2, 1, 1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");

        setVisible(true);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
    }

    public static void main(String[] args) {
        new Grid_Layout_Example();
    }
}
