package structural_design.composite;

import java.util.ArrayList;
import java.util.List;

public class Level implements GameElement {
    private String name;
    private List<GameElement> stages;

    public Level(String name) {
        this.name = name;
        this.stages = new ArrayList<>();
    }

    public void addStage(GameElement stage) {
        stages.add(stage);
    }

    public void removeStage(GameElement stage) {
        stages.remove(stage);
    }

    @Override
    public void play() {
        System.out.println("Playing level: " + name);
        for (GameElement stage : stages) {
            stage.play();
        }
    }
}
