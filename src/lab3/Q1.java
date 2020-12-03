package lab3;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        // declaration & initialization
        Scanner sc = new Scanner(System.in);
        String input;
        String[] temp;
        int num1;
        int num2;
        String op;
        char operand = ' ';
        double result = 0;
        boolean haveDecimal = false; // false if it is not decimal value

        // input
        System.out.print("Values: ");
        input = sc.nextLine(); // 30 5
        temp = input.split(" "); // assume we have 2 values => 30, 5
        num1 = Integer.parseInt(temp[0]);
        num2 = Integer.parseInt(temp[1]);

        System.out.print("Operand: ");
        op = sc.nextLine(); // +-+-
        operand = op.charAt(0); // index always start with 0
        // operand = sc.nextLine().charAt(0);

        // process
        switch(operand) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                result = (double) num1 / num2;
                haveDecimal = num1 % num2 != 0; // true if got reminder
                break;

            case '%':
                result = num1 % num2;
                break;
        }

        // output
        if(!haveDecimal) { // !false = true
            System.out.printf("%d %c %d = %.0f", num1, operand, num2, result);
        }
        else {
            System.out.printf("%d %c %d = %.2f", num1, operand, num2, result);
        }
    }

}
