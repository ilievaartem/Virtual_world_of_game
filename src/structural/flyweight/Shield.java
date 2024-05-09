package structural.flyweight;

public class Shield implements GameAsset {
    @Override
    public void use(String playerId) {
        System.out.println("Player with ID " + playerId + " is using a shield.");
    }
}
