package structural_design.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Flyweight  {
    private Map<String, GameCharacter> characters = new HashMap<>();

    public GameCharacter getCharacter(String name) {
        if (!characters.containsKey(name)) {
            characters.put(name, new ConcreteCharacter(name));
        }
        return characters.get(name);
    }
}
