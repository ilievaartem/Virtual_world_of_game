package structural_design.flyweight;

public class VirtualGame {
    public void useGameAsset(String playerId, String assetType) {
        GameAsset asset = GameAssetFactory.getGameAsset(assetType);
        asset.use(playerId);
    }
}
