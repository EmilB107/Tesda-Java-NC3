package challenges;
import java.util.Scanner;

public class Challenge10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a few words: ");
        String input = scanner.nextLine().trim();
        int wordCount = input.isEmpty()
        ? 0
        : input.split("\\s+").length; // splits the string wherever one or more whitespace characters occur

        System.out.println("Word count: " + wordCount);
        scanner.close();
    }
}
