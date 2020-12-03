package lab2;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
         // declare & initialize
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter the number of seconds: ");
        int input = sc.nextInt(); // 6000
        
        // process
        int hour = input / 3600; // 6000 / 3600 = 1
        int minute = (input % 3600) / 60; // 6000 % 3600 = 2400
        int remain = input % 60; // input % 3600 % 60
        // 6000 % 60 ; 6000 % 3600 % 60 (same result)

        
        // output
        System.out.println(input + " seconds is "
                           + hour + " hours, "
                           + minute + " minutes and "
                           + remain + " seconds");
    }
}