package dao;

import model.User;
import java.util.*;

public class UserDAO {
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User("admin", "123", "ADMIN", true));
        users.add(new User("student", "123", "STUDENT", true));
    }

    public User login(String username, String password) {
        for (User u : users) {
            if (u.getUsername().equals(username) &&
                u.getPassword().equals(password) &&
                u.isStatus()) {
                return u;
            }
        }
        return null;
    }
}