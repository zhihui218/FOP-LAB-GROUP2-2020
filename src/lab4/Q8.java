package lab4;

import java.util.Random;

/**
 *
 * @author TING WEI JING
 */
public class Q8 {

    public static void main(String[] args) {
        // declare & initialize
        Random rdm = new Random();
        int generatedValue;
        int primeCounter = 0;

        // process & output
        generatedValue = rdm.nextInt(101);
        System.out.println("Random value: " + generatedValue);
        outer:
        for(int oneByOneValue = 2; primeCounter < generatedValue; oneByOneValue++) { // 2 ... infinity

            inner:
            for(int j = 2; j <= Math.sqrt(oneByOneValue); j++) {
                if(oneByOneValue % j == 0) {
                    continue outer;
                }
            }
            primeCounter++;
            System.out.println(oneByOneValue);
        }

        // continue = skip
        // break = stop completely
        // label
//        while(true) {
//           
//            if(true) {
//                continue;
//            }
//            // operation
//            // operation
//        }
    }

}
