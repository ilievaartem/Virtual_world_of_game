package Lab6.Part2.Task1;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double amount) {
        if (amount > 0) {
            setSalary(getSalary() + amount);
        }
    }

    public double getSalary() {
        return salary;
    }

    private void setSalary(double value) {
        salary = value;
    }
}
