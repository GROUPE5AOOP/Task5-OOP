import javax.swing.*;


 //   AboutTab represents the "About" section for our application.
 //   I displays project details such as creators, class, and assignment info.

public class AboutTab extends JPanel {

    public AboutTab() {
        // Add padding around the panel content (top, left, bottom, right)
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Create a label with HTML text formatting easy text styling
        add(new JLabel("<html><h2> 🧑‍🎓 Student Management System </h2>"
                + "<p>Created Kirumira Eric  AOOP IUEA</p><br>"
                + "<p><b>Class:<b>  </b></b>BSCS</p>"
                + "<p><i>Course Work 2</i></p></html>"));
    }
}
