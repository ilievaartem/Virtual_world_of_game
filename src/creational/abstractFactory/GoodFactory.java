package creational.abstractFactory;

import creational.abstractFactory.nature.Bad;
import creational.abstractFactory.nature.Good;
import creational.abstractFactory.nature.Humanist;
import creational.abstractFactory.nature.Pacifist;

public class GoodFactory extends AbstractFactory{
    @Override
    public Good createGoodCharacter(CharacterNature nature){
        switch (nature) {
            case PACIFIST:
                return new Pacifist();
            case HUMANIST:
                return new Humanist();
            default:
                throw new IllegalStateException("Невідомий тип характера: " + nature);
        }
    }

    @Override
    public Bad createBadCharacter(CharacterNature nature) {
        throw new UnsupportedOperationException("GoodFactory не має реалізації для створення злих персонажів");
    }
}
