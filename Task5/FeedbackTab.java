import javax.swing.*;
import java.awt.*;


   // FeedbackTab provides a form for students to submit feedback.
   // Includes a text area and a submit button.

public class FeedbackTab extends JPanel {

    public FeedbackTab() {
        // Use BorderLayout with gaps between components
        setLayout(new BorderLayout(10, 10));
        setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        // Heading label
        JLabel label = new JLabel("💬 We value your feedback:");
        label.setFont(new Font("SansSerif", Font.BOLD, 16));
        add(label, BorderLayout.NORTH);

        // Multi-line text area for feedback input
        JTextArea feedbackArea = new JTextArea(8, 30);
        feedbackArea.setLineWrap(true);           // Automatically wrap text
        feedbackArea.setWrapStyleWord(true);      // Wrap at word boundaries
        feedbackArea.setBorder(BorderFactory.createEtchedBorder());

        // Add scroll pane so feedback area can scroll if text is long
        add(new JScrollPane(feedbackArea), BorderLayout.CENTER);

        // Submit button at the bottom
        JButton submitBtn = new JButton("📨 Submit");
        add(submitBtn, BorderLayout.SOUTH);
    }
}
