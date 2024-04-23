package behavioral.visitor;

public class Item implements GameObject {
    @Override
    public void accept(GameVisitor visitor) {
        visitor.visit(this);
    }
}