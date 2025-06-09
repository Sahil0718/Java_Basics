package Table;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import java.awt.*;

public class TableExample extends JFrame {
    DefaultTableModel dtm;
    JTable table;
    JScrollPane sp;

    public TableExample() {
        //Create and set up the table model
        dtm = new DefaultTableModel();
        dtm.addColumn("ID");
        dtm.addColumn("Name");
        dtm.addColumn("Address");
        dtm.addColumn("Phone");
        dtm.addColumn("E-Mail"); //(dtm) doesn't have a setFont() method

        //Create the JTable and assign the model

        table = new JTable(dtm);
        table.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
        table.setForeground(Color.BLUE);
        table.setRowHeight(25);

        //Add some sample data (optional)
        dtm.addRow(new Object[]{"1", "Ram", "Dallu", "123-456-7890", "ram@gmail.com"});
        dtm.addRow(new Object[]{"2", "Sita", "Teku", "987-764-0912", "sita@gmail.com"});

        //Set the scroll pane
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;

        //Configure table header
        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("JetBrains Mono", Font.BOLD, 18));
        header.setForeground(Color.RED);

        // Create scroll pane
        sp = new JScrollPane(table);

        //Configure the frame
        setLayout(new BorderLayout()); // Use layout manager
        add(sp, BorderLayout.CENTER); // Add scroll pane to frame

        setSize(600, 600);
        setTitle("Table Demo");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); // Show after adding components
        setIconImage(new ImageIcon("src/Table/chill_guy.jpg").getImage());

    }

    public static void main(String[] args) {
        new TableExample();
    }
}
