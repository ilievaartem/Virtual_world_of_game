package creational.singleton;

public class GameManager {
    private static volatile GameManager instance;

    private GameManager() {
    }

    public static GameManager getInstance() {
        if (instance == null) {
            synchronized (GameManager.class) {
                if (instance == null) {
                    instance = new GameManager();
                }
            }
        }
        return instance;
    }

    public void startGame() {
        System.out.println("Гра почалася!");
    }
}
