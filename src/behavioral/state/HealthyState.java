package behavioral.state;

public class HealthyState implements HealthState {
    @Override
    public void feed() {
        System.out.println("The animal character is healthy and well-fed.");
    }

    @Override
    public void treat() {
        System.out.println("No treatment needed for a healthy animal character.");
    }
}