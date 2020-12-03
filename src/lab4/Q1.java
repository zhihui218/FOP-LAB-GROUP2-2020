package lab4;

import java.util.Scanner;

/**
 *
 * @author TING WEI JING
 */
public class Q1 {

    public static void main(String[] args) {
        // declare & initialize
        Scanner sc = new Scanner(System.in);
        int input;

        // input
        input = sc.nextInt();

        // process & output
        for(int i = 1; i <= input; i++) {
            if(input % i == 0) {
                System.out.print((i == input) ? i : i + ", ");
            }
        }
        // variable = (<condition>) ? [true] : [false] ; 
        // 1, 2,
//        System.out.println("\b");
        // 1, 2
    }

}
