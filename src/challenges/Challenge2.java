/*
    Write a program that prompts the user to enter a month number
    (1 for January, 2 for February, etc.) and outputs the number of days in that month.
    Assume that February has 28 days.

    In this program, we use a switch-case statement to handle different month
    numbers entered by the user. The switch statement checks the value of the variable month,
    and executes the corresponding case block.
    If none of the cases match, the default block is executed.
*/
package challenges;
import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month number (1-12): ");
        int month = scanner.nextInt();
        switch (month) {
            case 1 -> System.out.println("January - 31 days");
            case 2 -> System.out.println("February - 28 days");
            case 3 -> System.out.println("March - 31 days");
            case 4 -> System.out.println("April - 30 days");
            case 5 -> System.out.println("May - 31 days");
            case 6 -> System.out.println("June - 30 days");
            case 7 -> System.out.println("July - 31 days");
            case 8 -> System.out.println("August - 31 days");
            case 9 -> System.out.println("September - 30 days");
            case 10 -> System.out.println("October - 31 days");
            case 11 -> System.out.println("November - 30 days");
            case 12 -> System.out.println("December - 31 days");
            default -> System.out.println("Invalid month");
        }
        scanner.close();
    }
}
