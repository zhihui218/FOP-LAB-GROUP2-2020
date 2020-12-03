package lab4;

import java.util.Scanner;

/**
 *
 * @author TING WEI JING
 */
public class Q2 {

    public static void main(String[] args) {
        // declare & initialize
        Scanner sc = new Scanner(System.in);
        int input;
        int hold = 0;
        int total = 0;
        
        // input
        input = sc.nextInt();
        
        
        // process
        for(int i = 1; i <= input; i++) {
            hold += i;
            total += hold;
            System.out.println(hold);
        }
        
        // output
        System.out.println(total);
    }

}
