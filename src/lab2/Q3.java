package lab2;

import java.util.Random;

public class Q3 {

    public static void main(String[] args) {
        // declaration & initialization
        Random rdm = new Random(); // seed
        int num1 = rdm.nextInt(41) + 10; // 10 to 50 => (0 - 40) + 10
        int num2 = rdm.nextInt(41) + 10;
        int num3 = rdm.nextInt(41) + 10;
        int sum;
        double avg;

        // process
        sum = num1 + num2 + num3;
        avg = sum / 3f; // double prefix , float postfix

        // output
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(sum);
        System.out.printf("%.2f \n", avg);

    }

}
