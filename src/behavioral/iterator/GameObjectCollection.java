package behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class GameObjectCollection implements Iterable<GameObject> {
    private List<GameObject> gameObjects;

    public GameObjectCollection() {
        this.gameObjects = new ArrayList<>();
    }

    public void addGameObject(GameObject gameObject) {
        gameObjects.add(gameObject);
    }

    @Override
    public Iterator<GameObject> iterator() {
        return gameObjects.iterator();
    }
}