/*
Write a program that takes a string as input and checks if it is a palindrome.
A palindrome is a word, number, or other sequence of characters
that reads the same forward and backward.

Your program should perform the following steps:

Use StringBuilder to create a new string that is a reverse of the input string.

Use the equals() method to check if the input string
and the reversed string are the same.

If the strings are the same, print "The input string is a palindrome."

If the strings are not the same, print "The input string is not a palindrome."
*/
package chapter3.task04;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        System.out.print("Enter a string to check for palindrome: ");
        String check = new String(new Scanner(System.in).nextLine());

        System.out.println(
            check.equals(new StringBuilder(check).reverse().toString())
            ? "The input string is a palindrome."
            : "The input string is not a palindrome."
        );
    }
}