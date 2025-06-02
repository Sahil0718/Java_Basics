package GUIControl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sum extends JFrame implements ActionListener {
    JTextField txt1, txt2;
    JLabel num1, num2, result;
    JButton sum;

    public Sum() {
        setSize(600, 600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Radio Button Example");
        setLocationRelativeTo(null);// is used to center a window
        setResizable(false);// prevents the user from resizing the window

        num1 = new JLabel("First Number:");
        add(num1).setBounds(100, 100, 150, 30);
        num1.setFont(new Font("JetBrains Mono", Font.BOLD, 14));

        txt1 = new JTextField();
        add(txt1).setBounds(300, 100, 100, 30);

        num2 = new JLabel("Second Number:");
        add(num2).setBounds(100, 150, 150, 30);
        num2.setFont(new Font("JetBrains Mono", Font.BOLD, 14));

        txt2 = new JTextField();
        add(txt2).setBounds(300, 150, 100, 30);

        result = new JLabel("Result:");
        add(result).setBounds(300, 200, 100, 30);
        result.setFont(new Font("Aptos", Font.BOLD, 14));

        sum = new JButton("SUM");
        add(sum).setBounds(300, 250, 100, 30);
        sum.setFont(new Font("Aptos", Font.BOLD, 14));

        sum.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == sum) {
            try {
                //Try Parsing input values
                double a = Double.parseDouble(txt1.getText());
                double b = Double.parseDouble(txt2.getText());
                //Showing the resulting value
                result.setText("Result: " + (a + b));
                //JOptionPane.showMessageDialog(null, "Result: " + (a + b));
            } catch (NumberFormatException ex) {
                //Clear result only if input is invalid
                result.setText("");
                //Shows the error message
                JOptionPane.showMessageDialog(null, "Please enter a valid input!");
            }
        }
    }


    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel((UIManager.getSystemLookAndFeelClassName()));
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        new Sum();
    }
}


