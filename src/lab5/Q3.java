package lab5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author TING WEI JING
 */
public class Q3 {

    public static void main(String[] args) {
        // declare & initialize
        Scanner sc = new Scanner(System.in);
        Random rdm = new Random();
        int[][] hour2D;
        int[] totalHour;
        int input;
        
        // input
        // 0 - Sun, 1 - Mon, 6 - Sat
        input = sc.nextInt(); // 5
        hour2D = new int[input][7];
        totalHour = new int[input];
        
        // process
        for(int i = 0; i < input; i++) {
            for(int j = 0; j < 7; j++) {
                hour2D[i][j] = rdm.nextInt(8) + 1;
                totalHour[i] += hour2D[i][j];
            }
        }
        
        // output
        for(int[] x : hour2D) {
            for(int y : x) {
                System.out.print(y + "\t");
            }
            System.out.println("");
        }
        for(int i = 0; i < input; i++) {
            System.out.println(totalHour[i]);
        }
        
    }

}
