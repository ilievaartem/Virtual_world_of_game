package structural_design.facade;

import java.util.ArrayList;
import java.util.List;

public class PlayerProcess {
    private String playerId;
    private List<GameRecord> records;

    public PlayerProcess(String playerId) {
        this.playerId = playerId;
        this.records = new ArrayList<>();
    }

    public void addRecord(GameRecord record) {
        records.add(record);
    }

    public List<GameRecord> getGameRecords() {
        return records;
    }

    public String getPlayerId() {
        return playerId;
    }
}