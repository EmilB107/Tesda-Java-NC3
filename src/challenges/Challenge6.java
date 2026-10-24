/*
    Integer input from the user and uses a for loop to generate the following pattern:
    ?????????????
*/
package challenges;
import java.util.Scanner;

public class Challenge6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("The pattern is: ");
        // for(int i = 0; i < number; i++) {
        //     for(int j = 0; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {

                if (i == 0 || i == number - 1||
                    j == 0 || j == number - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        scanner.close();
    }
}
