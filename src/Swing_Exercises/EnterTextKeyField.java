//WAP in Java having a form containing a text field and when return key is pressed the content of text field should be
//displayed is a dialog box
package Swing_Exercises;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnterTextKeyField extends JFrame {
    public EnterTextKeyField() {
        setTitle("Key TextField Example");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel label = new JLabel("Enter some text:");
        label.setBounds(30, 30, 120, 35);
        add(label);

        JTextField textField = new JTextField();
        textField.setBounds(150, 30, 200, 25);
        add(textField);

        //Adding up an action listener
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                JOptionPane.showMessageDialog(null, "You text entered is: " + input);
            }
        });
        setVisible(true);

    }

    public static void main(String[] args) {
        new EnterTextKeyField();
    }
}
