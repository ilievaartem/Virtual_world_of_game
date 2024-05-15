package structural.bridge;

public class MobilePlatform implements Platform {
    @Override
    public void play() {
        System.out.println("Playing game on mobile...");
    }
}
