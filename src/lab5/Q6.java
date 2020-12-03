package lab5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author TING WEI JING
 */
public class Q6 {

    public static void main(String[] args) {
        // declare & initialize
        Scanner sc = new Scanner(System.in);
        int[][] matrix;
        int size;

        // input
        size = sc.nextInt();
        matrix = new int[size][size];

        // process & output
        if(size <= 0) {
            System.exit(0);
        }

        matrix[0][0] = 1;
        
        for(int i = 1; i < size; i++) {
            matrix[i][0] = 1;
            for(int j = 1; j <= i; j++) {
                matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j];
            }
        }

        for(int[] x : matrix) {
            for(int y : x) {
                System.out.print(y + " ");
            }
            System.out.println("");
        }

//        System.out.println(Arrays.deepToString(matrix));

    }

}
