package structural.facade;

class GameRecSystem {
    public void saveGameRecord(String playerId, String gameData) {
        System.out.println("Saving game record for player with ID: " + playerId);
    }

    public String getGameRecord(String playerId) {
        System.out.println("Retrieving game record for player with ID: " + playerId);
        return "Game record data for player with ID " + playerId;
    }
}
