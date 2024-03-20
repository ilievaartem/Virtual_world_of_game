package structural_design.flyweight;

class ConcreteCharacter implements GameCharacter {
    private String name;

    public ConcreteCharacter(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Character: " + name);
    }
}