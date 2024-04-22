package behavioral.state;

public class GameObject {
    private HealthState healthState;

    public GameObject() {
        this.healthState = new HealthyState();
    }

    public void setHealthState(HealthState healthState) {
        this.healthState = healthState;
    }

    public void performFeed() {
        healthState.feed();
    }

    public void performTreatment() {
        healthState.treat();
    }
}