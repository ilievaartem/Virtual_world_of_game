package creational.prototype;

import java.util.HashMap;
public class CharacterCache {
    private HashMap<String, GameCharacter> characterCache = new HashMap<>();

    public GameCharacter getCharacter(String key) throws CloneNotSupportedException {
        return characterCache.get(key).clone();
    }

    public void addCharacter(String key, GameCharacter character) {
        characterCache.put(key, character);
    }
}