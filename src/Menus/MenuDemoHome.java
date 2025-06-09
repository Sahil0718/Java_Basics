package Menus;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MenuDemoHome extends JFrame {
    JMenuBar mb;
    JMenu menu1, menu2, menu3;
    JMenu sub1, sub2, sub3, sub4;
    JMenuItem it, is, us, ut, ds, dt, rt, rs, exitItem;

    public MenuDemoHome() {
        //Create menubar
        mb = new JMenuBar();
        setJMenuBar(mb);

        //Top level menus
        menu1 = new JMenu("Home");
        menu2 = new JMenu("View");
        menu3 = new JMenu("Exit");

        mb.add(menu1);
        mb.add(menu2);
        mb.add(menu3);

        //Submenus under "Home"
        sub1 = new JMenu("Insert");
        sub2 = new JMenu("Update");
        sub3 = new JMenu("Delete");
        sub4 = new JMenu("Report/View");

        menu1.add(sub1);
        menu1.add(sub2);
        menu1.add(sub3);
        menu1.add(sub4);

        //Inserting Items
        is = new JMenuItem("Insert Student");
        sub1.add(is);

        it = new JMenuItem("Insert Teacher");
        sub1.add(it);

        //Updating items
        us = new JMenuItem("Update Student");
        sub2.add(us);

        ut = new JMenuItem("Update Teacher");
        sub2.add(ut);

        //Delete Items
        ds = new JMenuItem("Delete Student");
        sub3.add(ds);

        dt = new JMenuItem("Delete Teacher");
        sub3.add(dt);

        //Report items
        rs = new JMenuItem("Report Student");
        sub4.add(rs);
        rt = new JMenuItem("Report Teacher");
        sub4.add(rt);

        //Exit menu item under "EXIT"
        exitItem = new JMenuItem("Exit");
        menu3.add(exitItem);

        //Exit action listener
        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(
                        MenuDemoHome.this, "Are you sure you want to exit? ",
                        "Exit Confirmation",
                        JOptionPane.YES_NO_OPTION
                );
                if (confirm == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });

        //Frame setup
        setSize(600, 600);
        setTitle("Table Demo");
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setIconImage(new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\Java_Basics\\src\\Table\\chill_guy.jpg").getImage());

    }

    public static void main(String[] args) {
        new MenuDemoHome();
    }

}
