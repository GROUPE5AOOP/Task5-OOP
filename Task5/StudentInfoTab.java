import javax.swing.*;
import java.awt.*;


 //  StudentInfoTab provides a form for entering student information.
 //  Uses GridBagLayout for flexible form arrangement.

public class StudentInfoTab extends JPanel {

    public StudentInfoTab() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Margin between components
        gbc.fill = GridBagConstraints.HORIZONTAL; // Components expand horizontally

        // Title label
        JLabel title = new JLabel("Enter Student Information");
        title.setFont(new Font("Serif", Font.BOLD, 20));

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2; // Span across 2 columns
        add(title, gbc);

        gbc.gridwidth = 1; // Reset for other components

        // Below are the entry points 

        // Name field
        gbc.gridy++;
        add(new JLabel("Name:"), gbc);
        gbc.gridx = 1;
        add(new JTextField(20), gbc);

        // Student ID field
        gbc.gridx = 0;
        gbc.gridy++;
        add(new JLabel("Student ID:"), gbc);
        gbc.gridx = 1;
        add(new JTextField(20), gbc);

        // Course field
        gbc.gridx = 0;
        gbc.gridy++;
        add(new JLabel("Course:"), gbc);
        gbc.gridx = 1;
        add(new JTextField(20), gbc);

        // Save button
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2; // Button spans full width
        JButton saveBtn = new JButton("📥 Save");
        add(saveBtn, gbc);
    }
}
