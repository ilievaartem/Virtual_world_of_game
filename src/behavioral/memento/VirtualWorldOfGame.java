package behavioral.memento;

public class VirtualWorldOfGame {
    public static void main(String[] args) {
        GameMemento game = new GameMemento("Level 1");
        System.out.println("Current game state: " + game.getStateName());

        GameStateCareTaker careTaker = new GameStateCareTaker();
        careTaker.saveGameState(game);

        game = new GameMemento("Level 2");
        System.out.println("Updated game state: " + game.getStateName());

        game = (GameMemento) careTaker.restoreGameState();
        System.out.println("Restored game state: " + game.getStateName());
    }
}