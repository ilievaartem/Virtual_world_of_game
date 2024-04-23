package behavioral.visitor;

public interface GameObject {
    void accept(GameVisitor visitor);
}