package structural.facade;

public class GameRecord {
    private String date;
    private String description;

    public GameRecord(String date, String description) {
        this.date = date;
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "GameRecord{" +
                "date='" + date + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}