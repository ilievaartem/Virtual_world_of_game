package creational.factory;

import creational.prototype.GameCharacter;

public interface CharacterFactory {
    GameCharacter createCharacter(String name) throws IllegalAccessException;
}
