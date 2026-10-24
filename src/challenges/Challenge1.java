/*
    Write a program that takes in the score of a student in a test
    and outputs their grade based on the following criteria:
    • A score of 90 or above gets an A grade 
    • A score between 80 and 89 gets a B grade 
    • A score between 70 and 79 gets a C grade 
    • A score between 60 and 69 gets a D grade 
    • A score below 60 gets an F grade
*/
package challenges;
import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's score (0-100): ");
        int score = scanner.nextInt();
        String grade;

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("The student's grade is: " + grade);
        scanner.close();
    }
}
