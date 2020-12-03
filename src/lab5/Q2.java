package lab5;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author TING WEI JING
 */
public class Q2 {

    public static void main(String[] args) {
        // declare & initialize
        Random rdm = new Random();
        int[] intArr = new int[10];
        boolean[] dupChecker = new boolean[21]; // all false (0 -20)
        // 0, 1, 2 ... 20 == 21 diff numbers

        // process
        for(int i = 0; i < 10; i++) { // i : 3
            int temp = rdm.nextInt(21); // 5
            
            // i : 3
            // if(true) // this num is inside the arr already
            if(dupChecker[temp]) { // dupChecker[5] ? true or false
                i--;  // i : 2
                continue;
            }
            
            dupChecker[temp] = true; // dupChecker[5] = true (to tell that this num is inside the arr already)
            intArr[i] = temp; // intArr[0] = 5
   
        }

        // output
        System.out.println(Arrays.toString(intArr));
    }

}
