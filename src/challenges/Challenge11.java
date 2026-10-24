/*
    Write a program that prompts the user to enter a string of at least 10 characters. Using the StringBuilder class, perform the following operations:

    1. Print the length of the string.
    2. Print the first character of the string.
    3. Print the last character of the string.
    4. Print the index of the first occurrence of the letter 'a' in the string.
    5. Print the substring of the string from index 3 to index 6.
    6. Append the string "123" to the end of the string.
    7. Insert the string "xyz" at index 4.
    8. Delete the substring from index 2 to index 4.
    9. Delete the character at index 8.
    10. Reverse the string and print it.

    Your program should utilize the charAt(), indexOf(), 
    length(), substring(), append(), insert(), delete(), 
    deleteCharAt(), and reverse() methods of the StringBuilder class.
*/
package challenges;
import java.util.Scanner;

public class Challenge11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder();
        
        while (true) {
            System.out.print("Enter a string of at least 10 characters: ");
            input.append(scanner.nextLine());

            if (input.length() < 10) {
                System.out.println("Input must be at least 10 characters long.");
                input.setLength(0); // clear input
                continue;
            }
            break;
        }

        System.out.println("Length of input: " + input.length());
        System.out.println("First character: " + input.charAt(0));
        System.out.println("Last character: " + input.charAt(input.length() - 1));
        System.out.println("Occurrences of 'a': " + input.indexOf("a"));
        System.out.println("Substring from index 3 to 6: " + input.substring(3, 7));
        System.out.println("Appended string: " + input.append("xyz"));
        System.out.println("Delete substring from index 2 to 4: " + input.delete(2, 5));
        System.out.println("Delete character at index 8: " + input.deleteCharAt(8));
        System.out.println("Reversed string: " + input.reverse());

        scanner.close();
    }
}