package behavioral.chain_of_responsibility;

public class Monster implements GameHandler {
    private GameHandler nextHandler;

    @Override
    public void handleRequest(GameEvent event) {
        if (event.getType().equals("defend")) {
            System.out.println("Monster defends!");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(event);
        }
    }

    public void setNextHandler(GameHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}