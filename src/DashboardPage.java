import javax.swing.*;
import java.awt.*;

public class DashboardPage extends JFrame {

    public DashboardPage(String firstName) {
        setTitle("Dashboard");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel welcomeLabel = new JLabel("Welcome to your dashboard, " + firstName + "!");
        welcomeLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(welcomeLabel, BorderLayout.CENTER);
        getContentPane().setBackground(new Color(240, 240, 240));

        setVisible(true);
    }
}

