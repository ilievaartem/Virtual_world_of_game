package creational.abstractFactory;

import creational.abstractFactory.nature.Bad;
import creational.abstractFactory.nature.Biligarh;
import creational.abstractFactory.nature.Good;
import creational.abstractFactory.nature.Militant;

public class BadFactory extends AbstractFactory {
    @Override
    public Bad createBadCharacter(CharacterNature nature){
        switch (nature){
            case MILITANT:
                return new Militant();
            case BILIGARH:
                return new Biligarh();
            default:
                throw new IllegalStateException("Невідомий тип характера: " + nature);
        }
    }
    @Override
    public Good createGoodCharacter(CharacterNature nature) {
        throw new UnsupportedOperationException("BadFactory не має реалізації для створення добрих персонажів");
    }
}
