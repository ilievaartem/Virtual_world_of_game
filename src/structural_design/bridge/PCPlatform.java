package structural_design.bridge;

public class PCPlatform extends Platform {
    public PCPlatform(Player player) {
        super(player);
    }

    @Override
    public void play() {
        System.out.print("платформа ПК: ");
        player.play();
    }
}