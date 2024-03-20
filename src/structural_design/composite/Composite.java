package structural_design.composite;

import java.util.ArrayList;
import java.util.List;


public class Composite implements GameComponent {
    private List<GameComponent> components = new ArrayList<>();

    public void add(GameComponent component) {
        components.add(component);
    }

    public void remove(GameComponent component) {
        components.remove(component);
    }

    @Override
    public void play() {
        for (GameComponent component : components) {
            component.play();
        }
    }
}
