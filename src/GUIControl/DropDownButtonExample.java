package GUIControl;
import javax.swing.*;
public class DropDownButtonExample extends JFrame{
    JComboBox cBox;


    public DropDownButtonExample(){
        setSize(600,600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Drop Down Button Example");
        setLocationRelativeTo(null);// is used to center a window
        setResizable(false);// prevents the user from resizing the window
        //setExtendsState(MAXIMIZER_BOTH);

        cBox = new JComboBox();
        add(cBox).setBounds(200,300,200,40);
        cBox.addItem("--Select--");
        cBox.addItem("Kathmandu");
        cBox.addItem("Janakpur");
        cBox.addItem("Lalitpur");
        cBox.addItem("Bhaktapur");
        cBox.addItem("Lumbini");
    }

    public static void main(String[] args) {
        new DropDownButtonExample();
    }
}