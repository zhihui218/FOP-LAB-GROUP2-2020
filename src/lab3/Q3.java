package lab3;

import java.util.Scanner;

public class Q3 {

    public static void main(String args[]) {
        // declare & initialize
        Scanner sc = new Scanner(System.in);
        double commFactor = 0;
        int input;

        // input
        System.out.print("Sales volume: ");
        input = sc.nextInt();

        // process
        if(input > 1000) { // input <=  100
            commFactor = 0.125;
        }
        else if(input > 500) { // input > 100 && <= 500
            commFactor = 0.1;
        }
        else if(input > 100) {
            commFactor = 0.075;
        }
        else if(input >= 0) {
            commFactor = 0.05;
        }
        else {
            System.out.println("Cannot calculate commission");
            System.exit(0);
        }

        // output
        System.out.printf("The commission is RM %.2f %n", input * commFactor);
    }

}
