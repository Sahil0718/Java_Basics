package GUIControl;
import javax.swing.*;
import java.awt.*;

public class CheckBoxExample extends JFrame{
    JCheckBox c1,c2,c3,c4,c5;
    CheckboxGroup bg;

    public CheckBoxExample(){
        setSize(600,600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("CheckBox Example");
        setLocationRelativeTo(null);// is used to center a window
        setResizable(false);// prevents the user from resizing the window
        //setExtendsState(MAXIMIZER_BOTH);

       c1= new JCheckBox("BSC.CSIT");
       add(c1).setBounds(200,200,100,30);

       c2= new JCheckBox("BCA");
       add(c2).setBounds(300,200,100,30);

        c3= new JCheckBox("BHM");
        add(c3).setBounds(400,200,100,30);

        c4= new JCheckBox("BBM");
        add(c4).setBounds(500,200,100,30);

        c5= new JCheckBox("BIM");
        add(c5).setBounds(600,200,100,30);


    }

    public static void main(String[] args) {
        new CheckBoxExample();
    }
}


