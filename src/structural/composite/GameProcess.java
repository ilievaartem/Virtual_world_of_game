package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class GameProcess implements GameElement {
    private List<GameElement> levels;

    public GameProcess() {
        this.levels = new ArrayList<>();
    }

    public void addLevel(GameElement level) {
        levels.add(level);
    }

    public void removeLevel(GameElement level) {
        levels.remove(level);
    }

    @Override
    public void play() {
        for (GameElement level : levels) {
            level.play();
        }
    }
}