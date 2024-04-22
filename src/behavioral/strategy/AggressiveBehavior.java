package behavioral.strategy;

public class AggressiveBehavior implements CharacterBehavior {
    @Override
    public void performBehavior() {
        System.out.println("engaging in aggressive behavior.");
    }
}