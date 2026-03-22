package view.student;

import view.common.Sidebar;

import javax.swing.*;
import java.awt.*;

public class StudentDashboard extends JFrame {

    public StudentDashboard() {
        setTitle("Student Dashboard");
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        add(new Sidebar("STUDENT"), BorderLayout.WEST);

        JPanel content = new JPanel();
        content.add(new JLabel("Welcome Student"));

        add(content, BorderLayout.CENTER);

        setVisible(true);
    }
}