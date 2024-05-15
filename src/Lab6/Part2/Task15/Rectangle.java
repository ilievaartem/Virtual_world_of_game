package Lab6.Part2.Task15;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
        calculateArea();
        calculatePerimeter();
    }

    private void calculateArea() {
        setArea(width * height);
    }

    private void calculatePerimeter() {
        setPerimeter(2 * (width + height));
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    private void setArea(double area) {
        this.area = area;
    }

    private void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
}
