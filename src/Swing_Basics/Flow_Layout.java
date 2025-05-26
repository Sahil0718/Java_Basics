package Swing_Basics;

import javax.swing.*;
import java.awt.*;

public class Flow_Layout {
    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(400, 500);

        jframe.setLayout(new FlowLayout(FlowLayout.CENTER));
        jframe.add(new JButton("Button 1"));
        jframe.add(new JButton("Button 2"));
        jframe.add(new JButton("Button 3"));
        JLabel label1 = new JLabel("I Love Panda🐼");

        jframe.add(label1);
        jframe.setVisible(true);

    }
}
