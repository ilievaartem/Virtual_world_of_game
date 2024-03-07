package creational.factory;

import creational.factory.enemy.EnemyType;
import creational.factory.enemy.BanditCharacter;
import creational.factory.enemy.OrkCharacter;
import creational.factory.enemy.TrollCharacter;
import creational.prototype.GameCharacter;

import java.util.Scanner;

public class EnemyFactory implements CharacterFactory {
    @Override
    public GameCharacter createCharacter(String name) throws IllegalAccessException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Виберіть тип ворога: Троль, орк, бандит");
        String input = scanner.nextLine().toUpperCase();

        creational.factory.enemy.EnemyType typeEvil = creational.factory.enemy.EnemyType.valueOf(input);

        switch (typeEvil) {
            case TROLL:
                return new TrollCharacter(name);
            case ORK:
                return new OrkCharacter(name);
            case BANDIT:
                return new BanditCharacter(name);
            default:
                throw new IllegalAccessException("Невідомий тип ворога: " + typeEvil);
        }
    }
}
