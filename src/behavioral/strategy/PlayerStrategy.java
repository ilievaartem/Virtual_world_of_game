package behavioral.strategy;

public class PlayerStrategy {
    private String playerName;
    private CharacterBehavior characterBehavior;

    public PlayerStrategy(String playerName) {
        this.playerName = playerName;
    }

    public void setCharacterBehavior(CharacterBehavior characterBehavior) {
        this.characterBehavior = characterBehavior;
    }

    public void performAction() {
        System.out.print(playerName + " is ");
        if (characterBehavior != null) {
            characterBehavior.performBehavior();
        } else {
            System.out.println("No behavior set.");
        }
    }
}