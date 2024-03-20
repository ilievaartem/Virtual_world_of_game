import creational.abstractFactory.BadFactory;
import creational.abstractFactory.GoodFactory;
import creational.abstractFactory.nature.Good;
import creational.abstractFactory.nature.Bad;
import creational.factory.player.CharacterType;
import creational.prototype.GameCharacter;
import creational.builder.CharacterBuilder;
import creational.factory.CharacterFactory;
import creational.factory.EnemyFactory;
import creational.factory.PlayerFactory;
import creational.prototype.CharacterCache;
import creational.singleton.GameManager;
import creational.abstractFactory.AbstractFactory;
import creational.abstractFactory.CharacterNature;
import structural_design.bridge.*;

public class Main {
    public static <Player, Flyweight, Game> void main(String[] args) throws IllegalAccessException {
        // Singleton Pattern
        GameManager gameManager = GameManager.getInstance();
        gameManager.startGame();

        // Factory Pattern
        CharacterFactory playerFactory = new PlayerFactory();
        CharacterFactory enemyFactory = new EnemyFactory();

        GameCharacter player = playerFactory.createCharacter("Гравець1");
        GameCharacter enemy = enemyFactory.createCharacter("Ворог1");

        System.out.println("Створено: " + player.getGameCharacterName());
        System.out.println("Створено: " + enemy.getGameCharacterName());

        // Abstract Factory Pattern
        AbstractFactory goodFactory = new GoodFactory();

        Good personGood = goodFactory.createGoodCharacter(CharacterNature.HUMANIST);

        System.out.println("Створено: " + personGood.getGoodNature());

        // Builder Pattern
        CharacterBuilder builder = new CharacterBuilder();
        GameCharacter customCharacter = builder.setName("Спеціальний персонаж")
                .canSteal(false)
                .canGoodFightAtTheStart(true)
                .canSpeakSupportWords(true)
                .canHelp(true)
                .canGiveMission(false)
                .setCharacterType(CharacterType.QUEST)
                .setCharacterNature(CharacterNature.HUMANIST)
                .build();

        System.out.println("Створено: " + customCharacter.getGameCharacterName());

        // Prototype Pattern
        CharacterCache characterCache = new CharacterCache();
        characterCache.addCharacter("Клон1", player);

        try {
            GameCharacter clonedCharacter = characterCache.getCharacter("Клон1");
            System.out.println("Склоновано: " + clonedCharacter.getGameCharacterName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //Bridge
        Player consolePlayer = (Player) new ConsolePlayer();
        Platform consolePlatform = new ConsolePlatform((structural_design.bridge.Player) consolePlayer);
        consolePlatform.play();

        Player pcPlayer = (Player) new PCPlayer();
        Platform pcPlatform = new PCPlatform((structural_design.bridge.Player) pcPlayer);
        pcPlatform.play();
    }
}
