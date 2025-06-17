package Swing_Exercises;

import javax.swing.*;
import java.awt.event.*;

public class SumCalculate extends JFrame {
    private JTextField tf1, tf2;
    private JLabel resultLabel;

    public SumCalculate() {
        setTitle("Sum and Difference Calculator");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel label1 = new JLabel("Number 1:");
        label1.setBounds(20, 20, 80, 25);
        add(label1);

        tf1 = new JTextField();
        tf1.setBounds(100, 20, 100, 25);
        add(tf1);

        JLabel label2 = new JLabel("Number 2:");
        label2.setBounds(20, 50, 80, 25);
        add(label2);

        tf2 = new JTextField();
        tf2.setBounds(100, 50, 100, 25);
        add(tf2);

        resultLabel = new JLabel("Result will appear here");
        resultLabel.setBounds(20, 85, 300, 25);
        add(resultLabel);

        //Add Mouse listener to the frame
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                calculateSum();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                calculateDifference();
            }
        });
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void calculateSum() {
        try {
            int num1 = Integer.parseInt(tf1.getText().trim());
            int num2 = Integer.parseInt(tf2.getText().trim());
            int sum = num1 + num2;
            resultLabel.setText(String.format("Sum: " + sum));
        } catch (NumberFormatException e) {
            resultLabel.setText("Please enter valid integer!");
        }
    }

    public void calculateDifference() {
        try {
            int num1 = Integer.parseInt(tf1.getText().trim());
            int num2 = Integer.parseInt(tf2.getText().trim());
            int diff = num1 - num2;
            resultLabel.setText(String.format("Difference: " + diff));
        } catch (NumberFormatException e) {
            resultLabel.setText("Please enter valid integer!");
        }
    }

    public static void main(String[] args) {
        new SumCalculate();
    }
}
