package behavioral.strategy;

public class DefensiveBehavior implements CharacterBehavior {
    @Override
    public void performBehavior() {
        System.out.println("engaging in defensive behavior.");
    }
}