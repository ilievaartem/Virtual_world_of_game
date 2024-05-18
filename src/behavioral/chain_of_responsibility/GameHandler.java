package behavioral.chain_of_responsibility;

public interface GameHandler {
    void handleRequest(GameEvent event);

    void setNextHandler(GameHandler nextHandler);
}