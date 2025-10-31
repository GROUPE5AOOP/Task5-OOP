import javax.swing.UIManager;


 // Main class is entry point for the application
 // It sets the launches the main window.
 
public class Main {
    public static void main(String[] args) {
        try {

            // Set the UI of our application
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        } catch (Exception e) { // checks and catchs the errors

            // Print error if something happens
            // System.out.print("Execption: " + e.getMessage());

            e.printStackTrace();
        }

        // Run the GUI
        javax.swing.SwingUtilities.invokeLater(() -> {
            new TabbedPane().setVisible(true);
        });
    }
}
