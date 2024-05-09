package structural.proxy;

public class RealGame implements Game {
    private String gameName;

    public RealGame(String gameName) {
        this.gameName = gameName;
        loadGame();
    }

    private void loadGame() {
        System.out.println("Гра '" + gameName + "' завантажується...");
    }

    @Override
    public void play() {
        System.out.println("Гра '" + gameName + "' починається!");
    }
}