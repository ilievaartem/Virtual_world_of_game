package structural_design.flyweight;

import java.util.HashMap;
import java.util.Map;

public class GameAssetFactory {
    private static final Map<String, GameAsset> assetPool = new HashMap<>();

    static GameAsset getGameAsset(String type) {
        return assetPool.computeIfAbsent(type, t -> {
            switch (t) {
                case "Sword":
                    return new Sword();
                case "Shield":
                    return new Shield();
                default:
                    throw new IllegalArgumentException("Unknown game asset type: " + t);
            }
        });
    }
}