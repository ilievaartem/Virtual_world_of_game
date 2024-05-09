package structural.adapter;

public class GamePlayerDataAdapter implements PlayerData {
    private PlayerScoreStatusAdapter playerScoreStatusAdapter;

    public GamePlayerDataAdapter(PlayerScoreStatusAdapter playerScoreStatusAdapter) {
        this.playerScoreStatusAdapter = playerScoreStatusAdapter;
    }

    @Override
    public String getPlayerName() {
        return playerScoreStatusAdapter.getPlayerName();
    }

    @Override
    public String getPlayerEmail() {
        return playerScoreStatusAdapter.getPlayerEmail();
    }

    @Override
    public int getPlayerAge() {
        return playerScoreStatusAdapter.getPlayerAge();
    }

    @Override
    public String getPlayerScore() {
        return playerScoreStatusAdapter.getScoreStatus();
    }
}
