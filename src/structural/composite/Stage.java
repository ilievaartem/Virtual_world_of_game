package structural.composite;

public class Stage implements GameElement {
    private String name;

    public Stage(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Playing stage: " + name);
    }
}