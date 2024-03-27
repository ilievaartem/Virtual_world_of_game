package creational.abstractFactory;

public class ChoiceFactory {
    public AbstractFactory createChoiceFactory(CharacterChoice type) {
        return switch (type) {
            case GOOD -> new GoodFactory();
            case BAD -> new BadFactory();
        };
    }
}
