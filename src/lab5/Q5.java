package lab5;

import java.util.Arrays;
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
        int[] arr = new int[20];
        boolean sortable = true;
        int target;
        boolean isFound = false;
        int loopCount = 0;

        // process
        System.out.println("Original: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = rdm.nextInt(101);
        }

        System.out.println(Arrays.toString(arr));

        // bubble sort
        while(sortable) {
            sortable = false;
            for(int i = 1; i < arr.length; i++) {
                if(arr[i] > arr[i - 1]) {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    sortable = true;
                }
            }
        }
        System.out.println("Sorted (>): ");
        System.out.println(Arrays.toString(arr));

        // 2nd method
//        Arrays.sort(arr);
//        int[] tempArr = new int[arr.length];
//        for(int i = 0; i < 10; i++) {
//            tempArr[i] = arr[arr.length - 1];
//        }
//        arr = tempArr;
        // input
        System.out.print("Input: ");
        target = sc.nextInt();

        for(int i = 0; i < arr.length; i++, loopCount++) {
            if(arr[i] == target) {
                isFound = true;
                break;
            }
        }
        System.out.println((isFound) ? "found" : "not found");
        System.out.println((isFound) ? loopCount : "");

        isFound = false;
        loopCount = 0;

        int high = arr.length - 1;
        int low = 0;
        int middle;

        while(!isFound && low <= high) {
            middle = (high + low) / 2;
            isFound = arr[middle] == target;
            high = (target > arr[middle]) ? middle - 1 : high;
            low = (target < arr[middle]) ? middle + 1 : low;
            loopCount++;
        }

        System.out.println((isFound) ? "found" : "not found");
        System.out.println((isFound) ? loopCount : "");

        // output
    }

}
