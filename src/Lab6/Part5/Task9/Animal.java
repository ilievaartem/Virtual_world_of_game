package Lab6.Part5.Task9;

public class Animal {
    private String species;

    public Animal(String species) {
        this.species = species;
    }

    public void eat() {
        System.out.println("The " + species + " is eating.");
    }

    public void sleep() {
        System.out.println("The " + species + " is sleeping.");
    }

    public void makeSound() {
        System.out.println("This animal makes a sound.");
    }
}
