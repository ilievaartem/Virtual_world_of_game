package Lab6.Part2.Task4;

public class ImmutablePoint {
    private final Point point;

    public ImmutablePoint(Point point) {
        this.point = new Point(point.getX(), point.getY());
    }

    public Point getPoint() {
        return new Point(point.getX(), point.getY());
    }
}
