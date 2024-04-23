package behavioral.visitor;

public class PlayerVisitor implements GameObject {
    @Override
    public void accept(GameVisitor visitor) {
        visitor.visit(this);
    }
}