package behavioral.visitor;

public class DialogueVisitor implements GameVisitor {
    @Override
    public void visit(PlayerVisitor player) {
        System.out.println("Engaging in dialogue with player: conversation, choices, etc.");
    }

    @Override
    public void visit(Enemy enemy) {
        System.out.println("Observing enemy behavior: taunts, threats, etc.");
    }

    @Override
    public void visit(Item item) {
        System.out.println("Inspecting item: description, lore, etc.");
    }
}