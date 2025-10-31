import javax.swing.*;
import java.awt.*;


 //   ResultsTab displays student results in a table format.
 //   Each row shows a course and the corresponding marks.

public class ResultsTab extends JPanel {

    public ResultsTab() {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        // Header label
        JLabel header = new JLabel("📊 Student Results");
        header.setFont(new Font("SansSerif", Font.BOLD, 18));
        add(header, BorderLayout.NORTH);

        // Column names for table
        String[] columnNames = {"Course", "Marks"};

        // Sample student results data
        Object[][] data = {
                {"Artificial Intelligence", 98},
                {"E-Commerce", 95},
                {"Networking", 88},
                {"Databases", 95},
                {"A.O.O.P", 95}
        };

        // Create a table with the above data
        JTable table = new JTable(data, columnNames);
        table.setRowHeight(25); // Increase row height for readability
        table.setFont(new Font("Monospaced", Font.PLAIN, 14));

        // Add table inside a scroll pane
        add(new JScrollPane(table), BorderLayout.CENTER);
    }
}
