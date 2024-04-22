package behavioral.template_method;

public abstract class GameAlgorithm {
    public final void execute() {
        initialize();
        performAction();
        if (checkCompletion()) {
            congratulatePlayer();
        } else {
            encouragePlayer();
        }
    }

    // Методи, що визначають загальну структуру алгоритму
    protected void initialize() {
        System.out.println("Initializing game algorithm...");
    }

    protected abstract void performAction();

    protected boolean checkCompletion() {
        return true; // Загальна реалізація, може бути перевизначена у підкласах
    }

    // Hook-методи, які можуть бути перевизначені у підкласах
    protected void congratulatePlayer() {
        System.out.println("Congratulations! You completed the game algorithm.");
    }

    protected void encouragePlayer() {
        System.out.println("Keep going! You're doing great!");
    }
}
