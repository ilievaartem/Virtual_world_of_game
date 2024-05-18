package Lab5;

import Lab5.Task1.User;
import Lab5.Task1.UserListProcessor;
import Lab5.Task2.*;

import java.util.ArrayList;
import java.util.List;

public class Lab5Main {
    public static void main(String[] args) {

        System.out.println("Task1");
        List<User> users = new ArrayList<>();
        users.add(new User("user", "user@chnu.edu.ua", "12345678", "address"));
        users.add(new User("admin", "admin@chnu.edu.ua", "0987654321", "address"));
        users.add(new User("user2", "user2@chnu.edu.ua", "qwerty12345", "address"));
        UserListProcessor processor = new UserListProcessor(users);
        System.out.println("Processing user list:");
        processor.processUserList();
        long adminCount = processor.countAdminUsers();
        System.out.println("Number of admin users: " + adminCount);
        User newUser = new User("new", "new@chnu.edu.ua", "pass12345", "new address");
        processor.addUser(newUser);
        System.out.println("\nProcessing user list after adding a new user:");
        processor.processUserList();

        System.out.println("Task2");
        System.out.println("Order");
        List<Item> items = new ArrayList<>();
        items.add(new Item("Minecraft", 10.0));
        items.add(new Item("Fortnite", 15.0));
        items.add(new Item("GTA", 20.0));
        Order order = new Order("Customer", items);
        order.processOrder();

        System.out.println("Person");
        Relationships relationships = new Relationships();
        relationships.addFriend("friend");
        relationships.addEnemy("enemy");
        Tasks tasks = new Tasks();
        tasks.addTask("first task");
        tasks.addTask("second task");
        Person person = new Person("name", 19, "gender");
        person.addRelationship(relationships);
        person.addTask(tasks);
        System.out.println("Person: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
        System.out.println("Relationships: " + person.getRelationships());
        System.out.println("Tasks: " + person.getTasks());
    }
}
