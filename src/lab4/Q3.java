package lab4;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author TING WEI JING
 */
public class Q3 {

    public static void main(String[] args) {
        // declare & initialize
        Scanner sc = new Scanner(System.in);
        int input = 0;
        int sum = 0;
        int N = 0;
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        double average = 0;
        double sumOfSquare = 0; // E(X^2)
        double variance = 0;
        double standardDeviation = 0;

        // input + process
        do {
            out.print("Enter a score [negative score to quit]: ");
            input = sc.nextInt();

            if(input > -1) { // check exclude -1 condition
                sum += input;
                N++;
                sumOfSquare += Math.pow(input, 2);

                if(input < minimum) { // find minimum
                    minimum = input;
                }
                if(input > maximum) { // find maximum
                    maximum = input;
                }
            }

        }
        while(input != -1); // quit looping condition

        average = (double) sum / N;
        variance = (sumOfSquare - Math.pow(sum, 2) / N) / (N - 1);
        standardDeviation = Math.sqrt(variance);

        // output
        out.println("Variance: " + variance);
        out.println("Minimum Score: " + minimum);
        out.println("Maximum Score: " + maximum);
        out.println("Average Score: " + average);
        out.printf("Standard Deviation: %.2f", standardDeviation);

    }

}
