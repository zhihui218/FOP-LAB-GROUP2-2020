package lab2;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // input % process
        System.out.print("Enter the amount of water in gram: ");
        double M = (sc.nextDouble() / 1000);
        
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double itemp = ((sc.nextDouble() - 32) / 1.8); // initial temperature
        
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double ftemp = ((sc.nextDouble() - 32) / 1.8); // final temperature
        
        double Q = M * (ftemp - itemp) * 4184; // given formula
        
        // output
        // e = x10^x
        System.out.printf("The energy needed is %.10e %n", Q);
        System.out.printf("The energy needed is %.10g %n", Q); // round off
    }
}