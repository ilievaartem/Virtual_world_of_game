package Lab6.Part1.Task5;

public class Department {
    private String name;
    private Employee manager;

    public Department(String name, Employee manager) {
        this.name = name;
        this.manager = manager;
    }

    public String getManagerName() {
        return manager.getName();
    }
}
