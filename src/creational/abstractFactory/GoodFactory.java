package creational.abstractFactory;

import creational.abstractFactory.nature.Bad;
import creational.abstractFactory.nature.Good;
import creational.abstractFactory.nature.Humanist;
import creational.abstractFactory.nature.Pacifist;


public class GoodFactory extends AbstractFactory {
    @Override
    public Good createGoodCharacter(Nature nature) {
        CharacterNature characterNature = mapNature(nature);
        switch (characterNature) {
            case PACIFIST:
                return new Pacifist();
            case HUMANIST:
                return new Humanist();
            default:
                throw new IllegalStateException("Невідомий тип характера: " + characterNature);
        }
    }

    @Override
    public Bad createBadCharacter(Nature nature) {
        throw new UnsupportedOperationException("GoodFactory не має реалізації для створення злих персонажів");
    }

    private CharacterNature mapNature(Nature nature) {
        switch (nature) {
            case GOOD:
                return CharacterNature.HUMANIST;
            default:
                throw new IllegalArgumentException("Невідомий тип характера: " + nature);
        }
    }
}