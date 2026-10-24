/* 
    Math Operations with Static Import

    Create a Java program that performs basic math operations (addition, subtraction, multiplication, division) using static imports from the Math class methods.
    The program should have the following features:
    - Define a class named Task9.
    - Inside the class, create static methods for addition, subtraction, multiplication, and division.
      Each method should take two parameters and return the result.
    - Use static imports for the Math class methods (Math.addExact(), Math.subtractExact(), Math.multiplyExact(), Math.floorDiv()).
    - In the main method, demonstrate the use of these static methods by performing some math operations with different values.
    - Display the results of each operation.
*/
package chapter4.task09;
import static java.lang.Math.*;

public abstract class Task9 {
    public static void main(String[] args) {
        System.out.println("Addition: " + add(10, 5));
        System.out.println("Subtraction: " + subtract(10, 5));
        System.out.println("Multiplication: " + multiply(10, 5));
        System.out.println("Division: " + divide(10, 5));
        
    }

    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static float divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (float) a / b;
    }
}