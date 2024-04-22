package behavioral.observe;

public class QuestSystem implements GameEventListener {
    private String playerName;

    public QuestSystem(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public void onEvent(String event) {
        System.out.println("Player " + playerName + " received event notification: " + event);
        if (event.equals("Quest Completed")) {
            System.out.println("Congratulations! You completed a quest!");
        }
    }
}