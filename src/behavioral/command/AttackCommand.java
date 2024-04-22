package behavioral.command;

public class AttackCommand implements GameCommand {
    private String characterId;
    private String targetId;

    public AttackCommand(String characterId, String targetId) {
        this.characterId = characterId;
        this.targetId = targetId;
    }

    @Override
    public void execute() {
        System.out.println("Character " + characterId + " attacking target " + targetId);
    }
}