package creational.factory.enemy;

import creational.prototype.GameCharacter;

public class BanditCharacter extends GameCharacter {
    public BanditCharacter(String name){
        super(name + "Грабіжник");
    }
}
