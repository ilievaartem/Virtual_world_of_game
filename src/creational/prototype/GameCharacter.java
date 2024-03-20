package creational.prototype;

import creational.abstractFactory.CharacterNature;
import creational.builder.CharacterBuilder;
import creational.factory.player.CharacterType;

public class GameCharacter implements Cloneable {
    private String name;
    private boolean canSteal;
    private boolean canGoodFightAtTheStart;
    private boolean canSpeakSupportWords;
    private boolean canHelp;
    private boolean canGiveMission;
    private CharacterType characterType;
    private CharacterNature characterNature;

    public GameCharacter(String name) {
        this.name = name;
    }

    public GameCharacter(CharacterBuilder builder) {
        this.name = builder.name;
        this.canSteal = builder.canSteal;
        this.canGoodFightAtTheStart = builder.canGoodFightAtTheStart;
        this.canSpeakSupportWords = builder.canSpeakSupportWords;
        this.canHelp = builder.canHelp;
        this.canGiveMission = builder.canGiveMission;
        this.characterType = builder.characterType;
        this.characterNature = builder.characterNature;
    }

    public String getGameCharacterName() {
        return name;
    }

    public void setCanSteal(boolean canSteal) {
        this.canSteal = canSteal;
    }

    public boolean canSteal() {
        return canSteal;
    }

    public void setCanGoodFightAtTheStart(boolean canGoodFightAtTheStart) {
        this.canGoodFightAtTheStart = canGoodFightAtTheStart;
    }

    public boolean canGoodFightAtTheStart() {
        return canGoodFightAtTheStart;
    }

    public void setCanSpeakSupportWords(boolean canSpeakSupportWords) {
        this.canSpeakSupportWords = canSpeakSupportWords;
    }

    public boolean canSpeakSupportWords() {
        return canSpeakSupportWords;
    }

    public void setCanHelp(boolean canHelp) {
        this.canHelp = canHelp;
    }

    public boolean canHelp() {
        return canHelp;
    }

    public void setCanGiveMission(boolean canGiveMission) {
        this.canGiveMission = canGiveMission;
    }

    public boolean canGiveMission() {
        return canGiveMission;
    }

    public void setCharacterType(CharacterType characterType) {
        this.characterType = characterType;
    }

    public CharacterType getCharacterType() {
        return characterType;
    }

    public void setCharacterNature(CharacterNature characterNature) {
        this.characterNature = characterNature;
    }

    public CharacterNature getCharacterNature() {
        return characterNature;
    }

    @Override
    public GameCharacter clone() throws CloneNotSupportedException {
        return (GameCharacter) super.clone();
    }
}
