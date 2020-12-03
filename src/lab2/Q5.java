package lab2;

import java.util.Random;

public class Q5 {

    public static void main(String[] args) {
        // declaration & initialization
        Random rdm = new Random(); // seed
        int num = rdm.nextInt(10001);
        int sumAll = 0;
        String numString = num + ""; // "1234"
        char digit; // "1234" => '1', '2', '3', '4'

        // process // i = 0 to 3
        for(int i = 0; i < numString.length(); i++) {
            digit = numString.charAt(i); // access char from string by index
            sumAll += Integer.parseInt(digit + ""); // convert string into int
        }

        // output
        System.out.println(sumAll);

        // another solution
        sumAll = 0;
        int oriNum = 0;
        for(int i = 0; i < 4; i++) { // 0 to 9999
            num = rdm.nextInt(10); // 0 to 9
            sumAll += num;
            oriNum += num; // oriNum = 10 + 2
            oriNum *= 10; // oriNum = 120
        }

    }

}
