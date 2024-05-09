package structural.adapter;

public class PlayerScoreStatusAdapter {
    private String name;
    private String email;
    private int age;
    private String score;

    public PlayerScoreStatusAdapter(String name, String email, int age, String score) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.score = score;
    }

    public String getPlayerName() {
        return name;
    }

    public String getPlayerEmail() {
        return email;
    }

    public int getPlayerAge() {
        return age;
    }

    public String getScoreStatus() {
        int numericScore = Integer.parseInt(score);
        if (numericScore < 100) {
            return "Новачок";
        } else if (numericScore < 500) {
            return "Професіонал";
        } else {
            return "Експерт";
        }
    }
}
