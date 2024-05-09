package structural.bridge;

public abstract class Platform {
    protected Player player;

    public Platform(Player player) {
        this.player = player;
    }

    public abstract void play();
}