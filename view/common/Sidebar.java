package view.common;

import javax.swing.*;
import java.awt.*;

public class Sidebar extends JPanel {
    public Sidebar(String role) {
        setLayout(new GridLayout(10, 1));
        setBackground(Color.DARK_GRAY);

        add(createButton("Dashboard"));

        if (role.equals("ADMIN")) {
            add(createButton("Students"));
            add(createButton("Courses"));
            add(createButton("Lecturers"));
            add(createButton("Tuition"));
        } else {
            add(createButton("My Info"));
            add(createButton("My Courses"));
            add(createButton("Grades"));
        }
    }

    private JButton createButton(String text) {
        JButton btn = new JButton(text);
        btn.setForeground(Color.WHITE);
        btn.setBackground(Color.GRAY);
        return btn;
    }
}