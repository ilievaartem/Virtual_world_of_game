package Lab6.Part5.Task9;

public class Cat extends Animal {
    public Cat() {
        super("cat");
    }

    @Override
    public void makeSound() {
        System.out.println("The cat is meowing.");
    }
}
