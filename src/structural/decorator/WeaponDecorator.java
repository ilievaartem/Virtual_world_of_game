package structural.decorator;

public class WeaponDecorator implements GameProfile {
    private GameProfile character;
    private String weaponInfo;

    public WeaponDecorator(GameProfile character, String weaponInfo) {
        this.character = character;
        this.weaponInfo = weaponInfo;
    }

    @Override
    public String display() {
        return character.display() + "\nWeapon Info: " + weaponInfo;
    }
}