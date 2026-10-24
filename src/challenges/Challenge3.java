/*
    create a program that will accept 1-7 inputs and print the day in a week that corresponds with that number
    
    1 Monday
    2 Tuesday
    3 Wednesday
    4 Thursday
    5 Friday
    6 Saturday
    7 Sunday
    Any other number or character must print invalid input
*/
package challenges;
import java.util.Scanner;

public  class Challenge3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a day number (1-7):");
        int day = scanner.nextInt();
    
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");
        }
        scanner.close();
    }
}
