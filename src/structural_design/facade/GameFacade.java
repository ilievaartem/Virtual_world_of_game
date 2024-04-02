package structural_design.facade;

public class GameFacade {
    private PlayerProcess playerProcess;
    private GameRecSystem gameRecSystem;
    private GameStatsSystem gameStatsSystem;

    public GameFacade() {
        this.gameRecSystem = new GameRecSystem();
        this.gameStatsSystem = new GameStatsSystem();
    }

    public void createPlayerProcess(String playerId) {
        this.playerProcess = new PlayerProcess(playerId);
    }

    public void createGameRecord(String date, String description) {
        if (playerProcess != null) {
            GameRecord record = new GameRecord(date, description);
            playerProcess.addRecord(record);
        }
    }

    public void saveGameRecord(String playerId, String gameData) {
        gameRecSystem.saveGameRecord(playerId, gameData);
    }

    public String getGameRecord(String playerId) {
        return gameRecSystem.getGameRecord(playerId);
    }

    public void trackGameStats(String playerId, String gameStats) {
        gameStatsSystem.trackGameStats(playerId, gameStats);
    }
}