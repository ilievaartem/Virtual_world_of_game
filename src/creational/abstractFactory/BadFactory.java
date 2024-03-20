package creational.abstractFactory;

import creational.abstractFactory.nature.Bad;
import creational.abstractFactory.nature.Biligarh;
import creational.abstractFactory.nature.Good;
import creational.abstractFactory.nature.Militant;

public class BadFactory extends AbstractFactory {
    @Override
    public Bad createBadCharacter(Nature nature){
        CharacterNature characterNature = mapNature(nature);
        switch (characterNature){
            case MILITANT:
                return new Militant();
            case BILIGARH:
                return new Biligarh();
            default:
                throw new IllegalStateException("Невідомий тип характера: " + nature);
        }
    }
    @Override
    public Good createGoodCharacter(Nature nature) {
        throw new UnsupportedOperationException("BadFactory не має реалізації для створення добрих персонажів");
    }

    private CharacterNature mapNature(Nature nature){
        switch (nature) {
            case BAD:
                return CharacterNature.MILITANT;
            default:
                throw new IllegalArgumentException("Невідомий тип характера: " + nature);
        }
    }
}
