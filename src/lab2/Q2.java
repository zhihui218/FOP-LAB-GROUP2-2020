package lab2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
         // declare & initialize
        Scanner sc = new Scanner(System.in);

        double P;   // car price
        double D;   // down payment
        double R;   // interest rate
        double Y;   // loan
        double M;   // monthly payment (output)

        // input
        // - = left justified
        // System.out.printf("Format Syntax", <values or variables>);
        System.out.printf("%25s %s", "The price of the car", "= RM ");
        P = sc.nextDouble();
        System.out.printf("%25s %s", "Down payment", "= RM ");
        D = sc.nextDouble();
        System.out.printf("%25s %s", "Interest rate in %", "= ");
        R = sc.nextDouble();
        System.out.printf("%25s %s", "Loan duration in year", "= RM ");
        Y = sc.nextDouble();

        // process
        M = (P - D) * (1 + R * Y / 100) / (Y * 12);

        // output
        System.out.printf("%-25s %s%.2f \n", "Monthly payment", "= RM", M);
    }
}