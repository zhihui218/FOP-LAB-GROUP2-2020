package lab4;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author TING WEI JING
 */
public class Q7 {

    public static void main(String[] args) {
        // declare & initialize
        Scanner sc = new Scanner(System.in);
        // FORMULA 1
        double M; // (OUTPUT) monthly paymeny
        double P; // (INPUT) principal 
        double i; // (INPUT) yearly interest rate in %
        double N; // (INPUT) total number of months

        // FORMULA 2
        double C; // (OUTPUT) principal portion due
        double n; // (OUTPUT) month under consideration
        double L; // (OUTPUT) interest due OR interest
        double R; // (OUTPUT) remaining principal balance due OR unpaid balance
        double totalInterest = 0;

        // input
        out.print("Enter principal amount: ");
        P = sc.nextInt();
        out.print("Enter interest in %: ");
        i = sc.nextDouble();
        out.print("Enter total number of month(s): ");
        N = sc.nextInt();

        // process + output
        // FORMULA 1
        M = (P * (i / (1200))) / (1 - Math.pow(1 + i / 1200, -N));

        out.printf("%-8s %18s %18s %18s %18s %18s %n", "Month", "Monthly Payment", "Principal", "Interest", "Unpaid Balance", "Total Interest");
        for(int monthCount = 1; monthCount <= N; monthCount++) {
            // FORMULA 2
            n = monthCount;
            C = M * Math.pow(1 + i / 1200, -(1 + N - n));
            L = M - C;
            R = L / (i / 1200) - C;
            totalInterest += L;
            out.printf("%-8d %18.2f %18.2f %18.2f %18.2f %18.2f %n", monthCount, M, C, L, R, totalInterest);
        }

    }

}
