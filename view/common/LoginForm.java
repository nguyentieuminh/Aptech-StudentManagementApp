package view.common;

import service.AuthService;
import model.User;

import javax.swing.*;
import java.awt.*;

public class LoginForm extends JFrame {
    private JTextField txtUser;
    private JPasswordField txtPass;
    private JButton btnLogin;

    public LoginForm() {
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        txtUser = new JTextField();
        txtPass = new JPasswordField();
        btnLogin = new JButton("Login");

        setLayout(new GridLayout(3, 2));
        add(new JLabel("Username"));
        add(txtUser);
        add(new JLabel("Password"));
        add(txtPass);
        add(new JLabel());
        add(btnLogin);

        btnLogin.addActionListener(e -> login());

        setVisible(true);
    }

    private void login() {
        AuthService service = new AuthService();
        User user = service.login(txtUser.getText(), new String(txtPass.getPassword()));

        if (user != null) {
            dispose();
            if (user.getRole().equals("ADMIN")) {
                new view.admin.AdminDashboard();
            } else {
                new view.student.StudentDashboard();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Login failed");
        }
    }
}