package Lab6.Part3.Task1;

public class User {
    private boolean isLoggedIn;

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }

    public boolean hasPermission(Resource resource) {
        return true;
    }
}
