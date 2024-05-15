package structural.bridge;

public class PCPlatform implements Platform {
    @Override
    public void play() {
        System.out.println("Playing game on PC...");
    }
}