/*
    1. Define an interface called Shape with the following methods:
    - calculateArea(): double (Math.PI \* radius \* radius)
    - calculatePerimeter(): double (2 \* Math.PI \* radius)

    2. Create an abstract class called AbstractShape that implements the Shape interface.
    This class should have:
    - Instance variables to represent common attributes of shapes: String color, double length, double width
    - A constructor to initialize these attributes.
    - Implementations for the calculateArea and calculatePerimeter methods.

    3. Implement two concrete classes that extend AbstractShape:
    - Circle: Representing a circle. Include a radius as an attribute.
    - Rectangle: Representing a rectangle. Include length and width as attributes.

    4. In the Main class:
    - Create instances of Circle and Rectangle.
    - Display their areas and perimeters.
*/
package chapter5.task15;

public class Task15 {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5);
        Rectangle rectangle = new Rectangle("Blue", 4, 6);

        System.out.println("Circle:");
        System.out.println("Color: " + circle.color);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        System.out.println("\nRectangle:");
        System.out.println("Color: " + rectangle.color);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}

interface Shape {
    public double calculateArea();
    public double calculatePerimeter();
}

abstract class AbstractShape implements Shape {
    protected String color;
    protected double length;
    protected double width;

    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    @Override
    public abstract double calculateArea();

    @Override
    public abstract double calculatePerimeter();
}