import behavioral.chain_of_responsibility.*;
import behavioral.command.AttackCommand;
import behavioral.command.CommandInvoker;
import behavioral.command.GameCommand;
import behavioral.command.MoveCommand;
import behavioral.iterator.Resource;
import behavioral.iterator.ResourceCollection;
import behavioral.mediator.GameMediator;
import behavioral.mediator.NPC;
import behavioral.mediator.PlayerMediator;
import behavioral.memento.GameMemento;
import behavioral.memento.GameState;
import behavioral.memento.IGameState;
import behavioral.observer.GameEventPublisher;
import behavioral.observer.MonsterSystem;
import behavioral.observer.QuestSystem;
import behavioral.state.GameObject;
import behavioral.state.SickState;
import behavioral.state.UnderTreatmentState;
import behavioral.strategy.AggressiveBehavior;
import behavioral.strategy.DefensiveBehavior;
import behavioral.strategy.PlayerStrategy;
import behavioral.strategy.SupportiveBehavior;
import behavioral.template_method.AttackAlgorithm;
import behavioral.template_method.EventHandlingAlgorithm;
import behavioral.template_method.GameAlgorithm;
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
import structural.bridge.*;
import structural.composite.ArmyUnit;
import structural.composite.Soldier;
import structural.decorator.ArmorDecorator;
import structural.decorator.BasicCharacter;
import structural.decorator.GameProfile;
import structural.decorator.WeaponDecorator;
import structural.facade.GameFacade;
import structural.flyweight.VirtualGame;
import structural.proxy.Proxy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         //Singleton
        System.out.println("Singleton");
        GameManager gameManager = GameManager.getInstance();
        gameManager.startGame();
        System.out.println();

         //Factory
        System.out.println("Factory");
        String factoryType = "ВОРОГ";
        CharacterFactory factory;
        if (factoryType.equals("ВОРОГ")) {
            factory = new EnemyFactory();
        } else if (factoryType.equals("ПЕРСОНАЖ")) {
            factory = new PlayerFactory();
        } else {
            System.out.println("Невідомий тип фабрики");
            return;
        }
        System.out.println();

        //Abstract Factory
        System.out.println("Abstract Factory");
        AbstractFactory goodFactory = new GoodFactory();
        Good personGood = goodFactory.createGoodCharacter(CharacterNature.HUMANIST);
        System.out.println("Створено: " + personGood.getGoodNature());
        System.out.println();

        //Builder
        System.out.println("Builder");
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
        System.out.println();

        //Prototype
        System.out.println("Prototype");
        CharacterCache characterCache = new CharacterCache();
        GameCharacter player = new GameCharacter("Персонаж1");
        characterCache.addCharacter("Клон1", player);
        try {
            GameCharacter clonedCharacter = characterCache.getCharacter("Клон1");
            System.out.println("Склоновано: " + clonedCharacter.getGameCharacterName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println();

        //Adapter
        System.out.println("Adapter");
        PlayerScoreStatusAdapter playerScoreStatusAdapter = new PlayerScoreStatusAdapter("Artem", "artem@google.com", 19, "1000");
        GamePlayerDataAdapter gamePlayerDataAdapter = new GamePlayerDataAdapter(playerScoreStatusAdapter);
        System.out.println("Player Name: " + gamePlayerDataAdapter.getPlayerName());
        System.out.println("Player Email: " + gamePlayerDataAdapter.getPlayerEmail());
        System.out.println("Player Age: " + gamePlayerDataAdapter.getPlayerAge());
        System.out.println("Player Score Status: " + gamePlayerDataAdapter.getPlayerScore());
        System.out.println();

        //Bridge
        System.out.println("Bridge");
        Platform console = new ConsolePlatform();
        Platform mobile = new MobilePlatform();
        Platform pc = new PCPlatform();
        Game gameOnConsole = new MyGame(console);
        Game gameOnMobile = new MyGame(mobile);
        Game gameOnPC = new MyGame(pc);
        gameOnConsole.play();
        gameOnMobile.play();
        gameOnPC.play();
        System.out.println();

        //Composite
        System.out.println("Composite");
        ArmyUnit division = new ArmyUnit("Division");
        ArmyUnit battalion1 = new ArmyUnit("Battalion 1");
        battalion1.addSubUnit(new Soldier("Soldier 1"));
        battalion1.addSubUnit(new Soldier("Soldier 2"));
        division.addSubUnit(battalion1);
        ArmyUnit battalion2 = new ArmyUnit("Battalion 2");
        battalion2.addSubUnit(new Soldier("Soldier 3"));
        battalion2.addSubUnit(new Soldier("Soldier 4"));
        division.addSubUnit(battalion2);
        division.deploy();
        System.out.println();

        //Decorator
        System.out.println("Decorator");
        GameProfile basicProfile = new BasicCharacter("Basic information");
        GameProfile profileWithWeapon = new WeaponDecorator(basicProfile, "Sword");
        GameProfile profileWithArmor = new ArmorDecorator(profileWithWeapon, "Steel armor");
        System.out.println(profileWithArmor.display());
        System.out.println();

        //Facade
        System.out.println("Facade");
        GameFacade gameFacade = new GameFacade();
        gameFacade.createPlayerProcess("player");
        gameFacade.createGameRecord("2024-01-01", "New game started");
        gameFacade.saveGameRecord("player", "data");
        String gameRecord = gameFacade.getGameRecord("player");
        System.out.println("Game Record: " + gameRecord);
        gameFacade.trackGameStats("player", "stats");
        System.out.println();

        //Proxy
        System.out.println("Proxy");
        Proxy proxy = new Proxy("MyGame");
        proxy.play();
        System.out.println();

        //Flyweight
        System.out.println("Flyweight");
        VirtualGame virtualGame = new VirtualGame();
        virtualGame.useGameAsset("player1", "Sword");
        virtualGame.useGameAsset("player2", "Shield");
        virtualGame.useGameAsset("player1", "Sword");
        System.out.println();

        //Chain of responsibility
        System.out.println("ChainOfResponsibility");
        GameHandler playerChain = new PlayerChain();
        GameHandler monster = new Monster();
        GameHandler defaultHandler = new DefaultHandler();
        playerChain.setNextHandler(monster);
        monster.setNextHandler(defaultHandler);
        GameEvent attackEvent = new GameEvent("attack");
        GameEvent defendEvent = new GameEvent("defend");
        GameEvent unknownEvent = new GameEvent("unknown");
        playerChain.handleRequest(attackEvent);
        playerChain.handleRequest(defendEvent);
        playerChain.handleRequest(unknownEvent);
        System.out.println();

        //Command
        System.out.println("Command");
        GameCommand attackCommand = new AttackCommand("player1", "enemy1");
        GameCommand moveCommand = new MoveCommand("player1", 10, 20);
        CommandInvoker invoker = new CommandInvoker();
        invoker.setCommand(attackCommand);
        invoker.executeCommand();
        invoker.setCommand(moveCommand);
        invoker.executeCommand();
        System.out.println();

        //Iterator
        System.out.println("Iterator");
        ResourceCollection resourceCollection = new ResourceCollection();
        resourceCollection.addResource(new Resource("Resource 1"));
        resourceCollection.addResource(new Resource("Resource 2"));
        resourceCollection.addResource(new Resource("Resource 3"));
        for (Resource resource : resourceCollection) {
            resource.performAction();
        }
        System.out.println();

        //Mediator
        System.out.println("Mediator");
        PlayerMediator player3 = new PlayerMediator(100);
        NPC enemy = new NPC(50);
        GameMediator mediator = new GameMediator(player3, enemy);
        System.out.println("Гравець атакує ворога");
        mediator.playerAttackedEnemy();
        System.out.println("Ворог атакує гравця");
        mediator.enemyAttackedPlayer();
        System.out.println();

        //Mediator
        System.out.println("Memento");
        GameState gameState = new GameState();
        IGameState initialGameState = new GameMemento("Початковий стан гри");
        gameState.saveGameState(initialGameState);
        // Зміни у грі
        IGameState restoredGameState = gameState.restoreGameState();
        System.out.println("Відновлений стан гри: " + restoredGameState.getStateName());
        System.out.println();

        //Observer
        System.out.println("Observer");
        GameEventPublisher publisher = new GameEventPublisher();
        MonsterSystem monsterSystem = new MonsterSystem();
        QuestSystem questSystem = new QuestSystem("Player1");
        publisher.subscribe(monsterSystem);
        publisher.subscribe(questSystem);
        publisher.notifyListeners("Monster Killed");
        publisher.notifyListeners("Quest Completed");
        publisher.unsubscribe(questSystem);
        publisher.notifyListeners("Quest Failed");
        System.out.println();

        //State
        System.out.println("State");
        GameObject animalCharacter = new GameObject();
        animalCharacter.performFeed();
        animalCharacter.performTreatment();
        animalCharacter.setHealthState(new SickState());
        animalCharacter.performFeed();
        animalCharacter.performTreatment();
        animalCharacter.setHealthState(new UnderTreatmentState());
        animalCharacter.performFeed();
        animalCharacter.performTreatment();
        System.out.println();

        //Strategy
        System.out.println("Strategy");
        PlayerStrategy player4 = new PlayerStrategy("Player");
        player4.setCharacterBehavior(new AggressiveBehavior());
        player4.performAction();
        player4.setCharacterBehavior(new DefensiveBehavior());
        player4.performAction();
        player4.setCharacterBehavior(new SupportiveBehavior());
        player4.performAction();
        player4.setCharacterBehavior(null);
        player4.performAction();
        System.out.println();

        //Template Method
        System.out.println("Template Method");
        System.out.println("Attack Algorithm:");
        GameAlgorithm attackAlgorithm = new AttackAlgorithm();
        attackAlgorithm.execute();
        System.out.println("Event Handling Algorithm:");
        GameAlgorithm eventHandlingAlgorithm = new EventHandlingAlgorithm();
        eventHandlingAlgorithm.execute();
        System.out.println("Movement Algorithm:");
        GameAlgorithm movementAlgorithm = new MovementAlgorithm();
        movementAlgorithm.execute();
        System.out.println();

        //Visitor
        System.out.println("Visitor");
        PlayerVisitor player5 = new PlayerVisitor();
        Enemy enemy5 = new Enemy();
        Item item = new Item();
        GameVisitor dialogueVisitor = new DialogueVisitor();
        GameVisitor questVisitor = new QuestVisitor();
        player5.accept(dialogueVisitor);
        enemy5.accept(dialogueVisitor);
        item.accept(dialogueVisitor);
        player5.accept(questVisitor);
        enemy5.accept(questVisitor);
        item.accept(questVisitor);
        System.out.println();
    }
}