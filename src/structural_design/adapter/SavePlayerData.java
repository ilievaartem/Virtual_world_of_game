package structural_design.adapter;
public class SavePlayerData implements PlayerData {
    private GamePlayerDataAdapter gamePlayerData;

    public SavePlayerData(String playerName, String playerEmail, int playerAge, int playerScore) {
        this.gamePlayerData = new GamePlayerDataAdapter(playerName, playerEmail, playerAge, playerScore);
    }

    @Override
    public String getPlayerName() {
        return gamePlayerData.getPlayerName();
    }

    @Override
    public String getPlayerEmail() {
        return gamePlayerData.getPlayerEmail();
    }

    @Override
    public int getPlayerAge() {
        return gamePlayerData.getPlayerAge();
    }

    @Override
    public int getPlayerScore() {
        return gamePlayerData.getPlayerScore();
    }
}
