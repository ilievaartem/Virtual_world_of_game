package behavioral.iterator;

public class Resource {
    private String name;

    public Resource(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void performAction() {
        System.out.println("Виконується дія з ресурсом: " + name);
    }
}
