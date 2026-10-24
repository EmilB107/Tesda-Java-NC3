/*
    Write a program that takes a user input string and performs the following operations:

    1. Find and print the length of the string.
    2. Convert the string to uppercase and print it.
    3. Convert the string to lowercase and print it.
    4. Print the first character of the string.
    5. Print the last character of the string.
    6. Print the substring starting from the second character to the fifth character of the string
*/
package challenges;
import java.util.Scanner;

public class Challenge8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        
        while (true) {
            System.out.print("Enter a string (more than 5 characters): ");
            input = scanner.nextLine();
            
            if (input.length() <= 5) {
                System.out.println("Please enter a string with more than 5 characters.");
                continue;
            }
            break;
        }

        System.out.println("Length of the string: " + input.length());
        System.out.println("Uppercase: " + input.toUpperCase());
        System.out.println("Lowercase: " + input.toLowerCase());
        System.out.println("First character: " + input.charAt(0));
        System.out.println("Last character: " + input.charAt(input.length() - 1));
        System.out.println("Substring (1, 5): " + input.substring(1, 5));
        scanner.close();
    }
}
