package Listener_Example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowListenerExample extends JFrame implements WindowListener {
    private JLabel statusLabel;

    public WindowListenerExample() {
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setSize(500, 500);
        setLayout(null);
        setLocationRelativeTo(null);

        //Add a status label to show current window state
        statusLabel = new JLabel("Window status: Ready");
        statusLabel.setBounds(20, 20, 460, 30);
        statusLabel.setFont(new Font("JetBrains Mono", Font.BOLD, 16));
        add(statusLabel);

        this.addWindowListener(this);
        setVisible(true);

    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
        statusLabel.setText("Window status: Opened!");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing");
        int choice = JOptionPane.showConfirmDialog(
                this, "Are you sure you want to exit?",
                "Exit Configuration", JOptionPane.YES_NO_OPTION
        );
        if (choice == JOptionPane.YES_OPTION) {
            System.out.println("Window is closed!");
            dispose();
            System.exit(0);
        } else {
            statusLabel.setText("Window status: Close cancelled!");
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
        statusLabel.setText("Window Status: Closed!");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window Minimized");
        statusLabel.setText("Window status: Minimized!");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Windows Activated");
        statusLabel.setText("Window status: Activated!");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Windows Deactivated");
        statusLabel.setText("Window status: Deactivated!");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Maximized");
        statusLabel.setText("Window status: Maximized!");
    }

    public static void main(String[] args) {
        new WindowListenerExample();
    }
}
