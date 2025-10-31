import javax.swing.*;


 //   CourseRegistrationTab allows a student to select courses to register for.
 //   Contains checkboxes for multiple courses and a register button.

public class CourseRegistrationTab extends JPanel {

    public CourseRegistrationTab() {
        // Use vertical box layout to stack components one below the other
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Title label
        JLabel label = new JLabel("Select Courses to Register:");
        label.setFont(label.getFont().deriveFont(16f)); // Increase font size
        add(label);
        add(Box.createVerticalStrut(10)); // Add vertical spacing

        // Add checkboxes for courses
        add(new JCheckBox("Artificial Intelligence"));
        add(new JCheckBox("E-Commerce"));
        add(new JCheckBox("Networking"));
        add(new JCheckBox("Databases"));
        add(new JCheckBox("A.O.O.P"));

        // Add spacing before the button
        add(Box.createVerticalStrut(15));

        // Register button
        JButton registerBtn = new JButton("✅ Register");
        add(registerBtn);
    }
}
