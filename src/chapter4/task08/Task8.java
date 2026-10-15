/*
    Write a program featuring an integer variable arguments method.
    The method should return the sum of all parameters and, for each parameter,
    the cumulative sum up to that point.
    For instance, given parameters (4, 5, 10),
    the program should compute the total for the first parameter,
    such as 4 = (1+2+3+4), and repeat this process for subsequent parameters.
*/
package chapter4.task08;

public class Task8 {
    public static void main(String[] args) {
        int totalSum = sumAndCumulative(4, 5, 10);

        System.out.println("Total Sum: " + totalSum);
    }

    public static int sumAndCumulative(int... numbers) {
        int totalSum = 0;
        
        for (int number : numbers) {
            int cumulativeSum = 0;
            
            for (int i = 1; i <= number; i++) {
                cumulativeSum += i;
            }

            System.out.println("Cumulative sum for " + number + ": " + cumulativeSum);
            totalSum += cumulativeSum;
        }
        return totalSum;
    }
}
