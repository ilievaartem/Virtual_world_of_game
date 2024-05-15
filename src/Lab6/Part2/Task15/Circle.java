package Lab6.Part2.Task15;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
        calculateArea();
        calculatePerimeter();
    }

    private void calculateArea() {
        setArea(Math.PI * radius * radius);
    }

    private void calculatePerimeter() {
        setPerimeter(2 * Math.PI * radius);
    }

    public double getRadius() {
        return radius;
    }

    private void setArea(double area) {
        this.area = area;
    }

    private void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
}
