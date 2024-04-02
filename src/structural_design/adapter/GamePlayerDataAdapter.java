package structural_design.adapter;

public class GamePlayerDataAdapter implements PlayerData  {
    private String name;
    private String email;
    private int age;
    private int score;

    public GamePlayerDataAdapter(String name, String email, int age, int score) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.score = score;
    }
    @Override
    public String getPlayerName() {
        return name;
    }

    @Override
    public String getPlayerEmail() {
        return email;
    }

    @Override
    public int getPlayerAge() {
        return age;
    }

    @Override
    public int getPlayerScore(){
        return score;
    }
}