package Lab6.Part5.Task7;

public class SuperClass {
    protected String name;
    protected double salary;

    public SuperClass(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}
