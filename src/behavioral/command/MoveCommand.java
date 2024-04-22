package behavioral.command;

public class MoveCommand implements GameCommand {
    private String characterId;
    private int targetX;
    private int targetY;

    public MoveCommand(String characterId, int targetX, int targetY) {
        this.characterId = characterId;
        this.targetX = targetX;
        this.targetY = targetY;
    }

    @Override
    public void execute() {
        System.out.println("Moving character " + characterId + " to position (" + targetX + ", " + targetY + ")");
    }
}