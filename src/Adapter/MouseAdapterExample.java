package Adapter;
//Frequently asked questions

import Listener_Example.Mouse_Listener_Example;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.*;
import java.awt.event.MouseEvent;

public class MouseAdapterExample extends MouseAdapter {
    JFrame frame;

    public MouseAdapterExample() {
        frame = new JFrame("MouseAdapter Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLayout(null);

        //Register this mouse adapter as the listener
        frame.addMouseListener(this);
        frame.setVisible(true);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Graphics g = frame.getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(), e.getY(), 50, 50);
    }

    public static void main(String[] args) {
        new MouseAdapterExample();
    }
}
