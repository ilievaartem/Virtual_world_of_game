package behavioral.mediator;

public class PlayerMediator {
    private int health;

    public PlayerMediator(int health) {
        this.health = health;
    }

    public int calculateDamage() {
        return 10;
    }

    public void receiveDamage(int damage) {
        health -= damage;
    }

    public boolean isAlive() {
        return health > 0;
    }
}
