package creational.singleton;

public class GameManager {
    private static GameManager instance;

    private GameManager() {
        // Ініціалізація гри
    }

    public static GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager();
        }
        return instance;
    }

    public void startGame() {
        System.out.println("Гра почалася!");
    }
}
