package creational.builder;

import creational.factory.player.CharacterType;
import creational.prototype.GameCharacter;
import creational.abstractFactory.CharacterNature;

public class CharacterBuilder {
    public String name;
    public boolean canSteal;
    public boolean canGoodFightAtTheStart;
    public boolean canSpeakSupportWords;
    public boolean canHelp;
    public boolean canGiveMission;
    public CharacterType characterType;
    public CharacterNature characterNature;

    public CharacterBuilder setName(String name) {
        java.util.Objects.requireNonNull(name, "Name cannot be null");
        this.name = name;
        return this;
    }

    public CharacterBuilder canSteal(boolean canSteal) {
        this.canSteal = canSteal;
        return this;
    }

    public CharacterBuilder canGoodFightAtTheStart(boolean canGoodFightAtTheStart) {
        this.canGoodFightAtTheStart = canGoodFightAtTheStart;
        return this;
    }

    public CharacterBuilder canSpeakSupportWords(boolean canSpeakSupportWords) {
        this.canSpeakSupportWords = canSpeakSupportWords;
        return this;
    }

    public CharacterBuilder canHelp(boolean canHelp) {
        this.canHelp = canHelp;
        return this;
    }

    public CharacterBuilder canGiveMission(boolean canGiveMission) {
        this.canGiveMission = canGiveMission;
        return this;
    }

    public CharacterBuilder setCharacterType(CharacterType characterType) {
        this.characterType = characterType;
        return this;
    }

    public CharacterBuilder setCharacterNature(CharacterNature characterNature) {
        this.characterNature = characterNature;
        return this;
    }

    public GameCharacter build() {
        return  new GameCharacter(this);
    }
}
