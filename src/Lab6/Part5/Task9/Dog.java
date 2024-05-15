package Lab6.Part5.Task9;

public class Dog extends Animal{
    public Dog() {
        super("dog");
    }

    @Override
    public void makeSound() {
        System.out.println("The dog is barking.");
    }
}
