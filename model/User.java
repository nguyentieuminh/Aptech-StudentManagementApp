package model;

public class User {
    private String username;
    private String password;
    private String role;
    private boolean status;

    public User(String username, String password, String role, boolean status) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.status = status;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getRole() { return role; }
    public boolean isStatus() { return status; }
}