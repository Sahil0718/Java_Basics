import javax.swing.*;
import java.awt.*;

public class Frame1 {
    public static void main(String[] args) {
        JFrame j = new JFrame("This is a frame!");
//        j.setSize(500, 300);
//        j.setLocation(250, 200);
        j.setBounds(500, 300, 200, 200);
        j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
        j.setVisible(true);

        JButton login = new JButton("Login");
        login.setBounds(40, 40, 100, 30);
        j.add(login);

//        j.setLayout(null);
//        j.setVisible(true);

        JTextField tf = new JTextField();
        tf.setBounds(40, 80, 100, 30);
        j.add(tf);

        JLabel label = new JLabel("Name");
        label.setBounds(40,  100 , 250, 30);
        j.add(label);

    }
}
