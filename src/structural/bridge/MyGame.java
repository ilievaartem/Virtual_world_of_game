package structural.bridge;

public class MyGame extends Game {
    public MyGame(Platform platform) {
        super(platform);
    }

    @Override
    public void play() {
        System.out.print("Starting MyGame. ");
        platform.play();
    }
}
