package structural_design.bridge;

public class ConsolePlatform extends Platform {
    public ConsolePlatform(Player player) {
        super(player);
    }

    @Override
    public void play() {
        System.out.print("Консольна платформа: ");
        player.play();
    }
}