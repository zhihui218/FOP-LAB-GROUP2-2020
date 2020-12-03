/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author TING WEI JING
 */
public class Q4 {

    public static void main(String[] args) {
        // declare & initialize
        int[][] matrix = {{1, 5, 7, 4},
                          {3, 6, 9, 2},
                          {5, 3, 8, 6},
                          {3, 1, 4, 5}};

        // process & output
        System.out.println("Normal:");
        for(int[] x : matrix) {
            for(int y : x) {
                System.out.print(y + " ");
            }
            System.out.println("");
        }

        // matrix[matrix.length - 1 - x][y]
        System.out.println("Rotated");
        for(int y = 0; y < matrix.length; y++) {

            for(int x = 0; x < matrix[y].length; x++) {
//                System.out.println((2 - x) + " " + y);
                System.out.print(matrix[matrix.length - 1 - x][y] + " ");
            }

            System.out.println("");
        }

        for(int i = 0; i < matrix.length; i++) {
            for(int j = matrix.length - 1; j >= 0; j--) {
                System.out.print(matrix[j][i]);
            }
        }

    }

}
