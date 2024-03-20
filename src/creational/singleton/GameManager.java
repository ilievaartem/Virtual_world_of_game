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

/*public class GameManager
    private GameManager() {
        // Ініціалізація гри
    }

    private static class SingletonHelper {
        private static final GameManager INSTANCE = new GameManager();
    }

    public static GameManager getInstance() {
        return SingletonHelper.INSTANCE ;
    }

    public void startGame() {
        sout("Гра почалася!");
    }
}
 */