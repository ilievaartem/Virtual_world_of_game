package creational.abstractFactory;

import creational.abstractFactory.nature.Bad;
import creational.abstractFactory.nature.Good;

public abstract class AbstractFactory {
    public abstract Good createGoodCharacter(CharacterNature nature);
    public abstract Bad createBadCharacter(CharacterNature nature);
}
