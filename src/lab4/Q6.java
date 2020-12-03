package lab4;

import static java.lang.System.out;
import java.util.Random;

/**
 *
 * @author TING WEI JING
 */
public class Q6 {

    public static void main(String[] args) {
        // declare & initialize
        Random rdm = new Random();
        int value = Math.abs(rdm.nextInt());
        int numOfDigit = 1;

        // process
        out.println("Random value: " + value);

        while((value /= 10) != 0) {
            out.println(value);
            numOfDigit++;
        }

        // output
        out.println("Number of digits: " + numOfDigit);
    }

//            new Random().nextInt(Integer.MAX_VALUE);
//        
//        Math.abs(new Random().nextInt());
}
