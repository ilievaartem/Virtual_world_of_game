package behavioral.memento;

public class GameStateCareTaker {
    private GameState gameState;

    // Збереження стану гри
    public void saveGameState(GameState gameState) {
        this.gameState = gameState;
    }

    // Отримання збереженого стану гри
    public GameState restoreGameState() {
        return gameState;
    }
}