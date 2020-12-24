package lab8;

import java.util.*;

/**
 *
 * @author TING WEI JING
 */
public class Number {

    static Random rdm = new Random();
    private int[] arrNum;

    public Number(int x, int y) {
        arrNum = new int[x];
        for(int i = 0; i < arrNum.length; i++) {
            arrNum[i] = rdm.nextInt(y + 1);
        }
    }

    public Number(int x) {
        this(x, 100);
    }

    public Number() {
        this(10, 100);
    }

    public void displayNumber() {
        String rawOutput = Arrays.toString(arrNum);
        System.out.println(rawOutput.substring(1, rawOutput.length() - 1));
    }

    public void displayEven() {
        for(int x : arrNum) {
            if(x % 2 == 0) {
                System.out.print(x + " ");
            }
        }
        System.out.println("");
    }

    public void displayPrime() {
        outer:
        for(int x : arrNum) {
            for(int i = 2; i <= Math.sqrt(x); i++) {
                if(x % i == 0) {
                    continue outer;
                }
            }
            System.out.print(x + " ");
        }
        System.out.println("");
    }

    public void displayMax() {
        int max = arrNum[0];
        for(int x : arrNum) {
            max = Math.max(x, max);
        }
        System.out.println(max);
    }

    public void displayMin() {
        int min = arrNum[0];
        for(int x : arrNum) {
            min = Math.min(x, min);
        }
        System.out.println(min);
    }

    public void displayAverage() {
        double avg = 0;
        for(int x : arrNum) {
            avg += x;
        }
        avg /= arrNum.length;
        System.out.println(avg);
    }

    public void displaySquare() {
        for(int x : arrNum) {
            double sqrtNum = Math.sqrt(x);
            if(sqrtNum - Math.floor(x) == 0) {
                System.out.print(x + " ");
            }
        }
        System.out.print("");
    }

}
