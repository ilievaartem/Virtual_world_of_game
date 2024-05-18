package behavioral.state;

public class UnderTreatmentState implements HealthState {
    @Override
    public void feed() {
        System.out.println("Feeding an animal character under treatment.");
    }

    @Override
    public void treat() {
        System.out.println("Animal character is already under treatment.");
    }
}