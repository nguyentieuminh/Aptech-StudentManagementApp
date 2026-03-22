package view.admin;

import view.common.Sidebar;

import javax.swing.*;
import java.awt.*;

public class AdminDashboard extends JFrame {

    public AdminDashboard() {
        setTitle("Admin Dashboard");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        add(new Sidebar("ADMIN"), BorderLayout.WEST);

        JPanel content = new JPanel();
        content.add(new JLabel("Welcome Admin"));

        add(content, BorderLayout.CENTER);

        setVisible(true);
    }
}