package structural_design.decorator;

public class ArmorDecorator implements GameProfile {
    private GameProfile character;
    private String armorInfo;

    public ArmorDecorator(GameProfile character, String armorInfo) {
        this.character = character;
        this.armorInfo = armorInfo;
    }

    @Override
    public String display() {
        return character.display() + "\nArmor Info: " + armorInfo;
    }
}