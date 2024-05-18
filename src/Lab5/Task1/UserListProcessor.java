package Lab5.Task1;

import java.util.List;

public class UserListProcessor {
    private List<User> users;

    public UserListProcessor(List<User> users) {
        this.users = users;
    }

    public void processUserList() {
        for (User user : users) {
            processUser(user);
        }
    }

    private void processUser(User user) {
        System.out.println("Processing user: " + user.getUsername());
        if (user.isAdmin()) {
            System.out.println("Admin user detected!");
        }
    }

    public long countAdminUsers() {
        return users.stream().filter(User::isAdmin).count();
    }

    public void addUser(User user) {
        if (!users.contains(user)) {
            users.add(user);
            System.out.println("User added: " + user);
        } else {
            System.out.println("User already exists: " + user);
        }
    }

}
