import javax.swing.*;


  // This is the main window for our application.
  // It uses a tabbed pane to organize multiple features into separate tabs.
 
public class TabbedPane extends JFrame {

    public TabbedPane() {
        setTitle(" 🧑‍🎓 Student Management System 🧑‍🎓");
        // setSize(800, 500);
        setExtendedState(JFrame.MAXIMIZED_BOTH);//makes the window size full screen
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a tabbed pane with scrollable tabs
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);

        // Add each tab (with icons represented by emojis)
        tabbedPane.addTab("🧑🏽‍🎓 Student Info", new StudentInfoTab());
        tabbedPane.addTab("📚 Course Registration", new CourseRegistrationTab());
        tabbedPane.addTab("📈 Results", new ResultsTab());
        tabbedPane.addTab("😀 Feedback", new FeedbackTab());
        tabbedPane.addTab("❓ About", new AboutTab());

        // Add tabbed pane to the frame
        add(tabbedPane);

        // Center window on screen
        setLocationRelativeTo(null);
    }
}
