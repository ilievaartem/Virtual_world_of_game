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
import structural_design.adapter.GamePlayerDataAdapter;
import structural_design.adapter.SavePlayerData;
import structural_design.bridge.*;
import structural_design.composite.GameProcess;
import structural_design.composite.Level;
import structural_design.composite.Stage;
import structural_design.decorator.ArmorDecorator;
import structural_design.decorator.BasicCharacter;
import structural_design.decorator.GameProfile;
import structural_design.decorator.WeaponDecorator;
import structural_design.facade.GameFacade;
import structural_design.flyweight.VirtualGame;
import structural_design.proxy.Proxy;

public class Main {
    public static <Player, Flyweight, Game> void main(String[] args) throws IllegalAccessException {
        // Singleton Pattern
        System.out.println("--------------Singleton--------------");
        GameManager gameManager = GameManager.getInstance();
        gameManager.startGame();

        // Factory Pattern
        System.out.println("--------------Factory--------------");
        CharacterFactory playerFactory = new PlayerFactory();
        CharacterFactory enemyFactory = new EnemyFactory();

        GameCharacter player = playerFactory.createCharacter("Гравець1");
        GameCharacter enemy = enemyFactory.createCharacter("Ворог1");

        System.out.println("Створено: " + player.getGameCharacterName());
        System.out.println("Створено: " + enemy.getGameCharacterName());

        // Abstract Factory Pattern
        System.out.println("--------------Abstract Factory--------------");
        AbstractFactory goodFactory = new GoodFactory();

        Good personGood = goodFactory.createGoodCharacter(CharacterNature.HUMANIST);

        System.out.println("Створено: " + personGood.getGoodNature());

        // Builder Pattern
        System.out.println("--------------Builder--------------");
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
        System.out.println("--------------Prototype--------------");
        CharacterCache characterCache = new CharacterCache();
        characterCache.addCharacter("Клон1", player);

        try {
            GameCharacter clonedCharacter = characterCache.getCharacter("Клон1");
            System.out.println("Склоновано: " + clonedCharacter.getGameCharacterName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // Adapter
        System.out.println("--------------Adapter--------------");
        GamePlayerDataAdapter playerDataAdapter = new GamePlayerDataAdapter("John", "john@example.com", 25, 1000);

        SavePlayerData savePlayerData = new SavePlayerData(playerDataAdapter.getPlayerName(), playerDataAdapter.getPlayerEmail(), playerDataAdapter.getPlayerAge(), playerDataAdapter.getPlayerScore());

        System.out.println("Player Name: " + savePlayerData.getPlayerName());
        System.out.println("Player Email: " + savePlayerData.getPlayerEmail());
        System.out.println("Player Age: " + savePlayerData.getPlayerAge());
        System.out.println("Player Score: " + savePlayerData.getPlayerScore());

        // Bridge
        System.out.println("--------------Bridge--------------");
        ConsolePlayer consolePlayer = new ConsolePlayer();
        PCPlayer pcPlayer = new PCPlayer();

        ConsolePlatform consolePlatform = new ConsolePlatform(consolePlayer);
        PCPlatform pcPlatform = new PCPlatform(pcPlayer);

        consolePlatform.play();
        pcPlatform.play();

        // Composite
        System.out.println("-------------Composite-------------");
        Level level1 = new Level("Level 1");
        level1.addStage(new Stage("Stage 1.1"));
        level1.addStage(new Stage("Stage 1.2"));

        Level level2 = new Level("Level 2");
        level2.addStage(new Stage("Stage 2.1"));
        level2.addStage(new Stage("Stage 2.2"));

        GameProcess gameProcess = new GameProcess();
        gameProcess.addLevel(level1);
        gameProcess.addLevel(level2);

        gameProcess.play();

        // Decorator
        System.out.println("-------------Decorator-------------");
        GameProfile basicProfile = new BasicCharacter("Basic character info");

        GameProfile profileWithWeapon = new WeaponDecorator(basicProfile, "Weapon: Sword");
        GameProfile profileWithArmor = new ArmorDecorator(profileWithWeapon, "Armor: Shield");

        System.out.println("Character Profile:");
        System.out.println(profileWithArmor.display());

        // Facade
        System.out.println("--------------Facade---------------");
        GameFacade gameFacade = new GameFacade();
        gameFacade.createPlayerProcess("123");
        gameFacade.createGameRecord("2024-03-30", "Game record description");
        gameFacade.saveGameRecord("123", "Game data");
        String gameRecord = gameFacade.getGameRecord("123");
        System.out.println("Retrieved game record: " + gameRecord);
        gameFacade.trackGameStats("123", "Game stats");

        // Proxy
        System.out.println("---------------Proxy---------------");
        Proxy proxy = new Proxy("MyGame");
        proxy.play();

        // Flyweight
        System.out.println("-------------Flyweight-------------");
        VirtualGame virtualGame = new VirtualGame();
        virtualGame.useGameAsset("1", "Sword");
        virtualGame.useGameAsset("2", "Shield");
    }
}