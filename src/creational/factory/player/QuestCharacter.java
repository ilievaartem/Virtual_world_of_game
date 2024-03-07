package creational.factory.player;

import creational.prototype.GameCharacter;

public class QuestCharacter extends GameCharacter {
    public QuestCharacter(String name){
        super(name + "Місія");
    }
}
