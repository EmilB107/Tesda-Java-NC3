/*
    sum and average of input array numbers
*/
package challenges;
import java.util.Scanner;

public class Challenge12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, average = 0, iterations = 0;

        System.out.print("Enter how many numbers: ");
        iterations = scanner.nextInt();

        System.out.print("Enter " + iterations + " integers: ");
        int[] numbers = new int[iterations];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
            average = sum / numbers.length;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        scanner.close();
    }
}