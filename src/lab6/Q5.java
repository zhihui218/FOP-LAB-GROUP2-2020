package lab6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author TING WEI JING
 */
public class Q5 {

    public static void main(String[] args) {
        // declare & initialize
        Scanner sc = new Scanner(System.in);
        Random rdm = new Random();
        int input;
        int x;
        int y;
        int score = 0;
        // input & process
        do {
            System.out.println("Enter neg num to quit:");
            x = rdm.nextInt(13);
            y = rdm.nextInt(13);
            System.out.printf("%d x %d = ", x, y);
            input = sc.nextInt();
            if(input < 0) {
                break;
            }
            score += (checkAnswer(x, y, input)) ? 1 : 0; // 1
//            if(checkAnswer(x, y, input)) score++; // 2
            
        }
        while(true);

        // output
        System.out.println("Score: " +score);
    }

    public static boolean checkAnswer(int x, int y, int input) {
        return x * y == input;
    }

}
