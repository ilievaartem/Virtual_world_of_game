package behavioral.strategy;

public class SupportiveBehavior implements CharacterBehavior {
    @Override
    public void performBehavior() {
        System.out.println("engaging in supportive behavior.");
    }
}