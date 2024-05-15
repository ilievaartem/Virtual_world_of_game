package Lab6.Part5.Task11;

public class Person {
    private Animal animal;

    public Person(Animal animal) {
        this.animal = animal;
    }

    public void interactWithAnimal() {
        animal.eat();
        animal.sleep();
    }

    public void playWithDog(Dog dog) {
        dog.bark();
    }

}
