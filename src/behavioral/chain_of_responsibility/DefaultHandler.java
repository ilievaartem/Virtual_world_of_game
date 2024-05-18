package behavioral.chain_of_responsibility;

public class DefaultHandler implements GameHandler {
    private GameHandler nextHandler;

    @Override
    public void handleRequest(GameEvent event) {
        System.out.println("Unhandled event: " + event.getType());
    }

    @Override
    public void setNextHandler(GameHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
