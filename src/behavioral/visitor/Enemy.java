package behavioral.visitor;

public class Enemy implements GameObject {
    @Override
    public void accept(GameVisitor visitor) {
        visitor.visit(this);
    }
}