package behavioral.memento;

public class GameMemento implements GameState {
    private final String stateName;

    public GameMemento(String stateName) {
        this.stateName = stateName;
    }

    @Override
    public String getStateName() {
        return stateName;
    }
}