package Listener_Example;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
import java.sql.SQLOutput;

public class Mouse_Listener_Example extends JFrame implements MouseListener {
    JLabel label;

    public Mouse_Listener_Example() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(null);
        setVisible(true);

        label = new JLabel();
        label.setBounds(0, 0, 300, 300);
        label.setBackground(Color.RED);
        label.setOpaque(true);//now the background will be pointed and visible
        add(label);//add the label to the frame
        label.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //Invoked when the mouse button has been clicked(pressed & released) on a component.
        //System.out.println("You Clicked the mouse");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //Invoked when the mouse button has been clicked has been clicked pressed on a component.
        System.out.println("You pressed the mouse!");
//        label.setBackground(Color.red);


    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("You released the mouse!");
        label.setBackground(Color.pink);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //Invoked when the mouse enters a component
        System.out.println("You enter the component");
        label.setBackground(Color.green);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //Invoked when the mouse exits the component
        System.out.println("You exited the component");
        label.setBackground(Color.cyan);
    }

    public static void main(String[] args) {
        new Mouse_Listener_Example();
    }
}
