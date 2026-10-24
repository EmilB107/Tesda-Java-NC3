/*
    Odd or even? positive or negative? or zero?
*/
package challenges;
import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println(number % 2 == 0
            ? "The number is even."
            : "The number is odd."
        );

        System.out.println(number > 0 
            ? "The number is positive."
            : (number < 0 ? "The number is negative."
            : "The number is zero.")
        );
        scanner.close();
    }
}
