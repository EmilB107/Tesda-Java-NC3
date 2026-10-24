package chapter5.task15;
import static java.lang.Math.PI;

public class Circle extends AbstractShape {
    private final double radius;

    public Circle(String color, double radius) {
        super(color, 0, 0); // length and width are not applicable for Circle
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }
}