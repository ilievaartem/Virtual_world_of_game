package behavioral.chain_of_responsibility;

public class GameEvent {
    private String type;

    public GameEvent(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}