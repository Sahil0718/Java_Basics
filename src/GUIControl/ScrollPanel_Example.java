package GUIControl;

import javax.swing.*;

public class ScrollPanel_Example {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Scroll Pane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JTextArea textArea = new JTextArea(10, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane);
        frame.setVisible(true);
    }
}
