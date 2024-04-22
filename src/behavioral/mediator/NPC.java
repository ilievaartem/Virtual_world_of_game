package behavioral.mediator;

public class NPC {
    private int health;

    public NPC(int health) {
        this.health = health;
    }

    public int calculateDamage() {
        return 8;
    }

    public void receiveDamage(int damage) {
        health -= damage;
    }

    public boolean isAlive() {
        return health > 0;
    }
}
