package structural_design.decorator;

public class BasicCharacter implements GameProfile {
    private String basicInfo;

    public BasicCharacter(String basicInfo) {
        this.basicInfo = basicInfo;
    }

    @Override
    public String display() {
        return basicInfo;
    }
}