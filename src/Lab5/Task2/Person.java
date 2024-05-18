package Lab5.Task2;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private String gender;

    private List<Relationships> relationships;
    private List<Tasks> tasks;


    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.relationships = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public List<Relationships> getRelationships() {
          return relationships;
    }
    public List<Tasks> getTasks() {
        return tasks;
    }
    public void addRelationship(Relationships relationship) {
        this.relationships.add(relationship);
    }

    public void addTask(Tasks task) {
        this.tasks.add(task);
    }

}
