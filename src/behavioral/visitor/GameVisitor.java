package behavioral.visitor;

public interface GameVisitor {
    void visit(PlayerVisitor player);
    void visit(Enemy enemy);
    void visit(Item item);
}