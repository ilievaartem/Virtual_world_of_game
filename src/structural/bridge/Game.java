package structural.bridge;

public abstract class Game {
    protected Platform platform;

    public Game(Platform platform) {
        this.platform = platform;
    }

    public abstract void play();
}
