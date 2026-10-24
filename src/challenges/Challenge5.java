/*
    Sum of all integer inputs
*/
package challenges;
import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a how many numbers you want to enter: ");
        int iteration = scanner.nextInt();
        System.out.print("Enter " + iteration + " numbers: ");
        int[] numbers = new int[iteration];
        int sum = 0;

        for (int i = 0; i < iteration; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        System.out.println("The sum of the numbers is: " + sum);
        scanner.close();
    }
}