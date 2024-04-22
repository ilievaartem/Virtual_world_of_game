package behavioral.observe;

import java.util.ArrayList;
import java.util.List;

public class GameEventPublisher {
    private List<GameEventListener> listeners;

    public GameEventPublisher() {
        this.listeners = new ArrayList<>();
    }

    public void subscribe(GameEventListener listener) {
        listeners.add(listener);
    }

    public void unsubscribe(GameEventListener listener) {
        listeners.remove(listener);
    }

    public void notifyListeners(String event) {
        for (GameEventListener listener : listeners) {
            listener.onEvent(event);
        }
    }
}