package GUIControl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JPanel_1 extends JFrame implements ActionListener {
    JPanel jp1, jp2;
    JButton b1, b2;

    public JPanel_1() {
        setSize(600, 600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("How to make a panel?");
        setLocationRelativeTo(null); //is used to center a window
        setResizable(false);//prevents the users from resizing the window
        setExtendedState(MAXIMIZED_BOTH); //JFrame.ICONIFIED - means "minimized"

        //Creation of first panel
        jp1 = new JPanel();
        add(jp1).setBounds(100, 100, 400, 400);
        jp1.setBackground(Color.GRAY);
        jp1.setLayout(null);

        jp2 = new JPanel();
        add(jp2).setBounds(550, 100, 400, 400);
        jp2.setBackground(Color.BLUE);
        jp2.setLayout(null);
        jp2.setVisible(true);
        jp2.hide();

        b1 = new JButton("Login");
        jp1.add(b1).setBounds(10, 10, 100, 30);

        b2 = new JButton("Menu");
        jp2.add(b2).setBounds(10, 10, 100, 30);
        b1.addActionListener(this);
        b2.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            jp2.show();
            jp1.hide();
        }
        if (e.getSource() == b2) {
            jp1.show();
            jp2.hide();
        }
    }

    public static void main(String[] args) {
        new JPanel_1();
    }
}
