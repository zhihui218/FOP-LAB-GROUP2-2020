/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author TING WEI JING
 */
public class Q1_ArrayList {
    
      public static void main(String[] args) {
        // declare & intialize
        Scanner sc = new Scanner(System.in);
        Random rdm = new Random();
        ArrayList<Integer> scoreList = new ArrayList<>();
        
        // size = 0
        
        scoreList.add(10);
        // [10]
        //size = 1
        
        scoreList.add(130);
        // [10, 130]
        // size = 2
        scoreList.get(0); // 10
        scoreList.get(1); // 130
        scoreList.get(2); // error
        
        
        scoreList.remove(10);
        // [130]
        // size = 1
        
        scoreList.contains(10); // false
        scoreList.set(0, 100); // [100]
        
        
        int[] scoreArr;
        int size;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        int sum = 0;
        double avg;

        // input
        System.out.print("Input: "); // 5
        size = sc.nextInt();
        scoreArr = new int[size]; // 5
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
