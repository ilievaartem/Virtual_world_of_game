package Lab5.Task2;

import java.util.ArrayList;
import java.util.List;

public class Tasks {
    private List<String> tasks;

    public Tasks() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        this.tasks.add(task);
    }

    public void removeTask(String task) {
        this.tasks.remove(task);
    }

    public List<String> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "tasks=" + tasks +
                '}';
    }
}
