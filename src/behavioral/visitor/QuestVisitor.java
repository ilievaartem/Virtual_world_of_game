package behavioral.visitor;

public class QuestVisitor implements GameVisitor {
    @Override
    public void visit(PlayerVisitor player) {
        System.out.println("Interacting with player: giving quests, checking progress, etc.");
    }

    @Override
    public void visit(Enemy enemy) {
        System.out.println("Interacting with enemy: attacking, defending, etc.");
    }

    @Override
    public void visit(Item item) {
        System.out.println("Interacting with item: picking up, using, etc.");
    }
}