package GUIControl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClickExample extends JFrame implements ActionListener {
    JRadioButton male,female;
    ButtonGroup bg;
    JCheckBox c1,c2,c3,c4,c5;
    JComboBox cBox;
    JButton btnclick;

    public ButtonClickExample() {
        setSize(600, 600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle(" Button Click Example");
        setLocationRelativeTo(null);// is used to center a window
        setResizable(false);// prevents the user from resizing the window
        //setExtendsState(MAXIMIZER_BOTH);
        //RAdio Button
        male = new JRadioButton("Male");
        add(male).setBounds(200,200,100,30);

        female = new JRadioButton("Female");
        add(female).setBounds(300,200,100,30);

        bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        //check box
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
        // combo box
        cBox = new JComboBox();
        add(cBox).setBounds(200,300,200,40);
        cBox.addItem("--Select--");
        cBox.addItem("Kathmandu");
        cBox.addItem("Janakpur");
        cBox.addItem("Lalitpur");
        cBox.addItem("Bhaktapur");
        cBox.addItem("Lumbini");

        btnclick = new JButton("Check");
        add(btnclick);
        Rectangle r =new Rectangle(200,450,120,40);
        btnclick.setBounds(r);
        btnclick.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnclick){
            if(male.isSelected()){
                JOptionPane.showMessageDialog(null,"Male is selected");
            }
            if(female.isSelected()){
                JOptionPane.showMessageDialog(null,"female is selected");
            }
            if(c1.isSelected()){
                JOptionPane.showMessageDialog(null,"c1 is selected");
            }
            if(!cBox.getSelectedItem().equals("--Select--")){
                JOptionPane.showMessageDialog(null,cBox.getSelectedItem());
            }
        }
    }

    public static void main(String[] args) {
        new ButtonClickExample();
    }
}
