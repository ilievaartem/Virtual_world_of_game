package behavioral.state;

public class UnderTreatmentState implements HealthState {
    @Override
    public void feed() {
        System.out.println("Feeding a character under treatment.");
    }

    @Override
    public void treat() {
        System.out.println("Character is already under treatment.");
    }
}