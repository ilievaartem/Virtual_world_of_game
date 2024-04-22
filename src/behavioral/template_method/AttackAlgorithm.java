package behavioral.template_method;

public class AttackAlgorithm extends GameAlgorithm {

    @Override
    protected void performAction() {
        System.out.println("Performing attack action...");
    }

    @Override
    protected boolean checkCompletion() {
        // Реалізація перевірки завершення конкретного алгоритму атаки
        return false;
    }
}