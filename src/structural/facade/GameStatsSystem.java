package structural.facade;

class GameStatsSystem {
    public void trackGameStats(String playerId, String gameStats) {
        System.out.println("Tracking game stats for player with ID: " + playerId + ", Game Stats: " + gameStats);
    }
}
