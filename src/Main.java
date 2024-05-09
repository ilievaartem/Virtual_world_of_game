import behavioral.chain_of_responsibility.GameEvent;
import behavioral.chain_of_responsibility.GameHandler;
import behavioral.chain_of_responsibility.Monster;
import behavioral.chain_of_responsibility.PlayerChain;
import behavioral.command.AttackCommand;
import behavioral.command.CommandInvoker;
import behavioral.command.MoveCommand;
import behavioral.iterator.GameObjectCollection;
import behavioral.mediator.GameMediator;
import behavioral.mediator.NPC;
import behavioral.mediator.PlayerMediator;
import behavioral.memento.GameMemento;
import behavioral.memento.GameState;
import behavioral.memento.GameStateCareTaker;
import behavioral.observe.GameEventPublisher;
import behavioral.observe.MonsterSystem;
import behavioral.observe.QuestSystem;
import behavioral.state.GameObject;
import behavioral.state.SickState;
import behavioral.state.UnderTreatmentState;
import behavioral.strategy.AggressiveBehavior;
import behavioral.strategy.PlayerStrategy;
import behavioral.template_method.AttackAlgorithm;
import behavioral.template_method.EventHandlingAlgorithm;
import behavioral.template_method.MovementAlgorithm;
import behavioral.visitor.*;
import creational.abstractFactory.AbstractFactory;
import creational.abstractFactory.CharacterNature;
import creational.abstractFactory.GoodFactory;
import creational.abstractFactory.nature.Good;
import creational.builder.CharacterBuilder;
import creational.factory.CharacterFactory;
import creational.factory.EnemyFactory;
import creational.factory.PlayerFactory;
import creational.factory.player.CharacterType;
import creational.prototype.CharacterCache;
import creational.prototype.GameCharacter;
import creational.singleton.GameManager;
import structural.adapter.GamePlayerDataAdapter;
import structural.adapter.PlayerScoreStatusAdapter;
import structural.adapter.SavePlayerData;
import structural.bridge.ConsolePlatform;
import structural.bridge.ConsolePlayer;
import structural.bridge.PCPlatform;
import structural.bridge.PCPlayer;
import structural.composite.GameProcess;
import structural.composite.Level;
import structural.composite.Stage;
import structural.decorator.ArmorDecorator;
import structural.decorator.BasicCharacter;
import structural.decorator.GameProfile;
import structural.decorator.WeaponDecorator;
import structural.facade.GameFacade;
import structural.flyweight.VirtualGame;
import structural.proxy.Proxy;

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
        PlayerScoreStatusAdapter playerDataAdapter = new PlayerScoreStatusAdapter("John", "john@example.com", 25, "1000");
        GamePlayerDataAdapter gamePlayerDataAdapter = new GamePlayerDataAdapter(playerDataAdapter.getPlayerName(), playerDataAdapter.getPlayerEmail(), playerDataAdapter.getPlayerAge(), playerDataAdapter.getPlayerScore());
        System.out.println("Player Name: " + gamePlayerDataAdapter.getPlayerName());
        System.out.println("Player Email: " + gamePlayerDataAdapter.getPlayerEmail());
        System.out.println("Player Age: " + gamePlayerDataAdapter.getPlayerAge());
        System.out.println("Player Score: " + gamePlayerDataAdapter.getScoreStatus());


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

        // Template Method
        System.out.println("----------Template Method----------");
        AttackAlgorithm attackAlgorithm = new AttackAlgorithm();
        attackAlgorithm.execute();

        EventHandlingAlgorithm eventHandlingAlgorithm = new EventHandlingAlgorithm();
        eventHandlingAlgorithm.execute();

        MovementAlgorithm movementAlgorithm = new MovementAlgorithm();
        movementAlgorithm.execute();

        // Mediator
        System.out.println("--------------Mediator--------------");
        GameMediator gameMediator = new GameMediator();
        PlayerMediator playerMediator = new PlayerMediator(100);
        NPC enemy = new NPC(50);
        gameMediator.playerAttackedEnemy();
        gameMediator.enemyAttackedPlayer();

        // Observer
        System.out.println("--------------Observer--------------");
        GameEventPublisher eventPublisher = new GameEventPublisher();
        MonsterSystem monsterSystem = new MonsterSystem();
        QuestSystem questSystem = new QuestSystem("Player1");
        eventPublisher.subscribe(monsterSystem);
        eventPublisher.subscribe(questSystem);
        eventPublisher.notifyListeners("Monster Killed");
        eventPublisher.notifyListeners("Quest Completed");

        // Chain of Responsibility
        System.out.println("------Chain of Responsibility------");
        GameHandler monster = new Monster();
        GameHandler player = new PlayerChain();
        ((Monster) monster).setNextHandler(player);
        GameEvent attackEvent = new GameEvent("attack");
        GameEvent defendEvent = new GameEvent("defend");
        monster.handleRequest(attackEvent);
        monster.handleRequest(defendEvent);

        // Command
        System.out.println("--------------Command---------------");
        CommandInvoker commandInvoker = new CommandInvoker();
        AttackCommand attackCommand = new AttackCommand("Player1", "Enemy1");
        MoveCommand moveCommand = new MoveCommand("Player1", 10, 20);
        commandInvoker.setCommand(attackCommand);
        commandInvoker.executeCommand();
        commandInvoker.setCommand(moveCommand);
        commandInvoker.executeCommand();

        // State
        System.out.println("---------------State----------------");
        GameObject gameObject = new GameObject();
        gameObject.performFeed();
        gameObject.performTreatment();
        gameObject.setHealthState(new SickState());
        gameObject.performFeed();
        gameObject.performTreatment();
        gameObject.setHealthState(new UnderTreatmentState());
        gameObject.performFeed();
        gameObject.performTreatment();

        // Iterator
        System.out.println("--------------Iterator--------------");
        GameObjectCollection gameObjects = new GameObjectCollection();
        gameObjects.addGameObject(new GameObject("Player"));
        gameObjects.addGameObject(new GameObject("Enemy1"));
        gameObjects.addGameObject(new GameObject("Enemy2"));
        gameObjects.addGameObject(new GameObject("Item1"));
        gameObjects.addGameObject(new GameObject("Item2"));
        for (GameObject gameObject : gameObjects) {
            System.out.println("- " + gameObject.getName());
        }

        // Strategy
        System.out.println("--------------Strategy--------------");
        PlayerStrategy playerStrategy = new PlayerStrategy("Player1");
        playerStrategy.setCharacterBehavior(new AggressiveBehavior());
        playerStrategy.performAction();

        // Memento
        System.out.println("---------------Memento--------------");
        GameState game = new GameMemento("Level 1");
        System.out.println("Current game state: " + game.getStateName());

        // Збереження поточного стану гри
        GameStateCareTaker careTaker = new GameStateCareTaker();
        careTaker.saveGameState(game);

        // Зміна стану гри
        game = new GameMemento("Level 2");
        System.out.println("Updated game state: " + game.getStateName());

        // Відновлення збереженого стану гри
        game = careTaker.restoreGameState();
        System.out.println("Restored game state: " + game.getStateName());

        // Visitor
        System.out.println("---------------Visitor--------------");
        DialogueVisitor dialogueVisitor = new DialogueVisitor();
        QuestVisitor questVisitor = new QuestVisitor();
        PlayerVisitor playerVisitor = new PlayerVisitor();
        Enemy enemyVisitor = new Enemy();
        Item itemVisitor = new Item();
        dialogueVisitor.visit(playerVisitor);
        dialogueVisitor.visit(enemyVisitor);
        dialogueVisitor.visit(itemVisitor);
        questVisitor.visit(playerVisitor);
        questVisitor.visit(enemyVisitor);
        questVisitor.visit(itemVisitor);
    }
    }
}