package structural_design.facade;

class GameStatsSystem {
    public void trackGameStats(String playerId, String gameStats) {
        System.out.println("Tracking game stats for player with ID: " + playerId + ", Game Stats: " + gameStats);
    }
}
