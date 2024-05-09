package structural.proxy;

public class Proxy implements Game {
    private String gameName;
    private RealGame realGame;

    public Proxy(String gameName) {
        this.gameName = gameName;
    }

    @Override
    public void play() {
        if (realGame == null) {
            realGame = new RealGame(gameName);
        }
        realGame.play();
    }
}