package behavioral.chain_of_responsibility;

public class PlayerChain implements GameHandler {
    private GameHandler nextHandler;

    @Override
    public void handleRequest(GameEvent event) {
        if (event.getType().equals("attack")) {
            System.out.println("Player attacks!");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(event);
        }
    }

    public void setNextHandler(GameHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}