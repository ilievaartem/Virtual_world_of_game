package structural_design.bridge;

public class ConsolePlayer implements Player {
    @Override
    public void play() {
        System.out.println("Гра на консольній платформі");
    }
}