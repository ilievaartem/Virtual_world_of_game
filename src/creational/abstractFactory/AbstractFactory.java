package creational.abstractFactory;

import creational.abstractFactory.nature.Bad;
import creational.abstractFactory.nature.Good;

public abstract class AbstractFactory {
    public abstract Good createGoodCharacter(Nature nature);
    public abstract Bad createBadCharacter(Nature nature);
}
