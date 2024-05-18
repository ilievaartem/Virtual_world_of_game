package behavioral.memento;

public class GameState {
    private IGameState gameState;

    public void saveGameState(IGameState gameState) {
        this.gameState = gameState;
    }

    public IGameState restoreGameState() {
        return gameState;
    }
}