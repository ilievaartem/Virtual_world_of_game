package structural.composite;

public class Soldier implements MilitaryUnit {
    private String name;

    public Soldier(String name) {
        this.name = name;
    }

    @Override
    public void deploy() {
        System.out.println("Deploying soldier: " + name);
    }
}
