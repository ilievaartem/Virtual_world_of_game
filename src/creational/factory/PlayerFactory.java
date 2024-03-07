package creational.factory;

import creational.factory.player.BankerCharacter;
import creational.factory.player.CharacterType;
import creational.factory.player.QuestCharacter;
import creational.factory.player.TraderCharacter;
import creational.prototype.GameCharacter;

import java.util.Scanner;

public class PlayerFactory implements CharacterFactory {
    @Override
    public GameCharacter createCharacter(String name) throws IllegalAccessException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Виберіть тип персонажа: торгівець, замовник завдань, банкір");
        String input = scanner.nextLine().toUpperCase();

        creational.factory.player.CharacterType type = creational.factory.player.CharacterType.valueOf(input);

        switch (type) {
            case TRADER:
                return new TraderCharacter(name);
            case QUEST:
                return new QuestCharacter(name);
            case BANKER:
                return new BankerCharacter(name);
            default:
                throw new IllegalAccessException("Невідомий тип персонажа: " + type);
        }
    }
}
