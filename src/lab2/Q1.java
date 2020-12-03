package lab2;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        // declaration & initialization
        Scanner sc = new Scanner(System.in);
        double tempF;
        double result;
        
        // input
        System.out.print("Temperature in Fahrenheit: ");
        tempF = sc.nextDouble();
        
        // process
        result = (tempF - 32) / 1.8;
        
        // output
        System.out.printf("Temperature in Celsius: %-25f \n", result);
        
    }

}
