package Listener_Example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Key_Listener_Example extends JFrame implements KeyListener {
    JLabel label;
    ImageIcon icon;
    int x = 0, y = 0;

    public Key_Listener_Example() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.cyan);

        // Load & scale the image - replace "icon.png" with your actual image path
        ImageIcon originalIcon = new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\Java_Basics\\src\\Listener_Example\\kite.png"); // Make sure the image exists at this path
        Image img = originalIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        icon = new ImageIcon(img);

        label = new JLabel(icon);
        label.setBounds(x, y, 100, 100);

        this.add(label);
        this.addKeyListener(this);
        this.setFocusable(true);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char keyChar = e.getKeyChar();
        switch (keyChar) {
            case 'w':
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 's':
                label.setLocation(label.getX(), label.getY() + 10);
                break;
            case 'a':
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 'd':
                label.setLocation(label.getX() + 10, label.getY());
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_LEFT:
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case KeyEvent.VK_UP:
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case KeyEvent.VK_RIGHT:
                label.setLocation(label.getX() + 10, label.getY());
                break;
            case KeyEvent.VK_DOWN:
                label.setLocation(label.getX(), label.getY() + 10);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Optional: Handle release if needed
    }

    public static void main(String[] args) {
        new Key_Listener_Example();
    }
}