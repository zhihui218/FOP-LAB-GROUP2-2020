package lab6;

import java.util.*;

/**
 *
 * @author TING WEI JING
 */
public class Q1 {
    // https://stackoverflow.com/questions/1235179/simple-way-to-repeat-a-string

    public static void main(String[] args) {
        // process & output
        for(int i = 1; i <= 20; i++) {
            System.out.println(displayTriNum(i));
        }
    }

    public static int displayTriNum(int input) {
        int result = 0;

        for(int i = 1; i <= input; i++) {
            result += i;
        }
        return result;
    }

}
