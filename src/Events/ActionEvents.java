package Events;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvents extends JFrame implements ActionListener {
    JButton b1;
    JTextField textField;

    public ActionEvents() {
        setTitle("Textfield + Button");
        setSize(400, 200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Creating text field
        textField = new JTextField();
        textField.setBounds(50, 40, 200, 30);
        textField.addActionListener(this); // <-- Added this line

        // Creating button
        b1 = new JButton("SUBMIT");
        b1.setBounds(260, 40, 80, 30);
        b1.addActionListener(this);

        // adding components
        add(textField);
        add(b1);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = textField.getText().trim();

        if (e.getSource() == b1) {
            if (input.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Text Field is empty!", "WARNING!", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Button Clicked! Text: " + input);
            }
        } else if (e.getSource() == textField) {
            JOptionPane.showMessageDialog(this, "Enter pressed! Text: " + input);
        }
    }

    public static void main(String[] args) {
        new ActionEvents();
    }
}