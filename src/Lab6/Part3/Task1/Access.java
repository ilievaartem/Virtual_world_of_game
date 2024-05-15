package Lab6.Part3.Task1;

public class Access {
    public void checkAccess(User user, Resource resource) {
        if (checkLog(user, resource)) {
            if (checkPermission(user, resource)) {
                System.out.println("Access granted");
            } else {
                System.out.println("Access denied");
            }
        } else {
            System.out.println("Access denied");
        }
    }

    private boolean checkLog(User user, Resource resource) {
        return user != null && user.isLoggedIn() && resource != null;
    }

    private boolean checkPermission(User user, Resource resource) {
        return user != null && user.hasPermission(resource);
    }
}
