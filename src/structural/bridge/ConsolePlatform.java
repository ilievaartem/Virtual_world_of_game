package structural.bridge;

public class ConsolePlatform implements Platform {
    @Override
    public void play() {
        System.out.println("Playing game on console...");
    }
}