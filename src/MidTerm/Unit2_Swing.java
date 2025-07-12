package MidTerm;

import java.awt.*;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.*;

/// /An example of no layout
//public class Unit2_Swing extends JFrame {
//    JLabel l1;
//
//    public Unit2_Swing() {
//        setSize(300, 200);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setVisible(true);
//        setLayout(null);
//
//        l1 = new JLabel("WADDUPP!");
//        l1.setBounds(30, 40, 200, 50);
//        add(l1);
//    }
//
//    public static void main(String[] args) {
//        new Unit2_Swing();
//    }
//}

/// /Flow Layout Example
//public class Unit2_Swing extends JFrame {
//    JPanel p1;
//
//    public Unit2_Swing() {
//        setSize(300, 200);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//
//
//        p1 = new JPanel(new FlowLayout());
//        p1.add(new JButton("Button1"));
//        p1.add(new JButton("Button2"));
//        p1.add(new JButton("Button3"));
//        p1.add(new JButton("Button4"));
//
//        getContentPane().add(p1);
          //setVisible(true);
//
//    }
//    public static void main(String[] args) {
//        new Unit2_Swing();
//    }

//}
//
//

////Border Layout Example
//public class Unit2_Swing extends JFrame {
//    JPanel p1;
//
//    public Unit2_Swing() {
//        setSize(800, 600);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//
//
//        p1 = new JPanel(new BorderLayout());
//        p1.add(new JButton("Button1"), BorderLayout.NORTH);
//        p1.add(new JButton("Button2"), BorderLayout.SOUTH);
//        p1.add(new JButton("Button3"), BorderLayout.EAST);
//        p1.add(new JButton("Button4"), BorderLayout.WEST);
//        p1.add(new JButton("Button5"), BorderLayout.CENTER);
//        getContentPane().add(p1);
//
//        setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        new Unit2_Swing();
//    }
//}

////Grid Layout Example
//public class Unit2_Swing extends JFrame{
//    JPanel panel;
//    public Unit2_Swing(){
//        setTitle("Grid Layout Example");
//        setSize(800,600);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//
//        panel = new JPanel(new GridLayout(3,2,5,5));
//        panel.add(new JButton("Button1"));
//        panel.add(new JButton("Button2"));
//        panel.add(new JButton("Button3"));
//        panel.add(new JButton("Button4"));
//        panel.add(new JButton("Button5"));
//        panel.add(new JButton("Button6"));
//
//        getContentPane().add(panel);
//        setVisible(true);
//
//    }
//
//    public static void main(String[] args) {
//        new Unit2_Swing();
//    }
//}

////Grid Bag Laout
//public class Unit2_Swing extends JFrame{
//    JPanel j1;
//    public Unit2_Swing(){
//        setTitle("Grid Bag Layout Example");
//        setSize(800,600);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//
//        j1 = new JPanel(new GridBagLayout());
//
//        GridBagConstraints gbc = new GridBagConstraints();
//        gbc.fill = GridBagConstraints.HORIZONTAL;
//
//        gbc.gridx = 1;
//        gbc.gridy = 0;
//        j1.add(new JButton("Button1"),gbc);
//
//        gbc.gridx = 0;
//        gbc.gridy = 0;
//        j1.add(new JButton("Butotn2"), gbc);
//
//        gbc.gridx = 0;
//        gbc.gridy = 1;
//        gbc.ipady = 5;
//        j1.add(new JButton("Button3"),gbc);
//
//        getContentPane().add(j1);
//
//        setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        new Unit2_Swing();
//    }
//}
//


