package lab5;

import java.util.*;

/**
 *
 * @author TING WEI JING
 */
public class Q1 {

    public static void main(String[] args) {
        // declare & intialize
        Scanner sc = new Scanner(System.in);
        Random rdm = new Random();

        int[] scoreArr;
        int size;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        int sum = 0;
        double avg;

        // input
        System.out.print("Input: "); // 5
        size = sc.nextInt();
        scoreArr = new int[size];
        // false = 0 (bit) true = 1 (bit)

        // process
        for(int i = 0; i < scoreArr.length; i++) {
            scoreArr[i] = rdm.nextInt(101);
            sum += scoreArr[i];
            if(scoreArr[i] > highest) {
                highest = scoreArr[i];
            }
            if(scoreArr[i] < lowest) {
                lowest = scoreArr[i];
            }
        }

        avg = (double) sum / size;

        // output
//        for(int x: scoreArr) { // java for each loop
//            System.out.print(x + " ");
//        }
        String listDisplay = Arrays.toString(scoreArr);
        listDisplay = listDisplay.replace("[", "");
        listDisplay = listDisplay.replace("]", "");
        System.out.println(listDisplay);

        System.out.println("");
        System.out.println(lowest);
        System.out.println(highest);
        System.out.println(avg);

    }

}
