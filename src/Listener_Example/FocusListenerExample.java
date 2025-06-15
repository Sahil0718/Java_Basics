package Listener_Example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;


public class FocusListenerExample extends JFrame implements FocusListener {
    JTextField t1;
    JTextArea TA;

    public FocusListenerExample() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(null);
        setLocationRelativeTo(null);

        //Create and add JTextField
        t1 = new JTextField("Click to edit me");
        t1.setBounds(50, 50, 200, 30);
        t1.addFocusListener(this);
        add(t1);

        //Create and add JTextArea
        TA = new JTextArea("Click to write here...");
        TA.setBounds(50, 100, 300, 200);
        TA.addFocusListener(this);
        add(TA);

        setVisible(true);
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (e.getSource() == t1) {
            System.out.println("TextField gained focus");
            t1.setBackground(Color.PINK);
        } else if (e.getSource() == TA) {
            System.out.println("TextArea gained focus");
            TA.setBackground(Color.cyan);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource() == t1) {
            System.out.println("TextField lost focus");
            t1.setBackground(Color.WHITE);
        } else if (e.getSource() == TA) {
            System.out.println("TextArea lost focus");
            TA.setBackground(Color.WHITE);
        }
    }

    public static void main(String[] args) {
        new FocusListenerExample();
    }
}
