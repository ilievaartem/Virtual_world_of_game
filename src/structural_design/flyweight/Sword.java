package structural_design.flyweight;

public class Sword implements GameAsset {
    @Override
    public void use(String playerId) {
        System.out.println("Player with ID " + playerId + " is using a sword.");
    }
}
