package Lab6.Part1.Task5;

public class Employee {
    private String name;
    private Department department;

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }


    public Department getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }
}
