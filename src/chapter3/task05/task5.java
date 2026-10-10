/*
    Check Whose Largest Number in 3 Inputs

    Write a program that takes in three numbers from the user and outputs the largest number.
    If all numbers are equal, it will print "All numbers are equal."
*/

package chapter3.task05;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[3];
        int biggest;
        boolean isSame = true;

        System.out.print("Enter three numbers: ");

        for(int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }

        biggest = num[0];

        for(int i = 1; i < num.length; i++) {
            if(num[i] > biggest) {
                biggest = num[i];
            }

            if(num[i] != num[0]) {
                isSame = false;
            }
        }

        System.out.println((isSame) ? "All numbers are equal." : "The biggest number is: " + biggest);

        scanner.close();
    }
}
