package pastYear2019_1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author TING WEI JING
 */
public class Q2 {

    public static void main(String[] args) {
        // declare & initialize
        Scanner sc = new Scanner(System.in);
        int[][] matrixA;
        int[][] matrixB;
        int[][] addMatrix;
        int size;

        // input
        size = sc.nextInt();
        matrixA = generateMatrix(size);
        matrixB = generateMatrix(size);

        // output
        System.out.println("Matrix A");
        displayMatrix(matrixA);
        System.out.println("Matrix B");
        displayMatrix(matrixB);
        addMatrix = addMatrix(matrixA, matrixB);
        System.out.println("A + B");
        displayMatrix(addMatrix);

        addMatrix = multiplyMatrix(matrixA, matrixB);
        System.out.println("A X B");
        displayMatrix(addMatrix);

    }

    public static int[][] generateMatrix(int size) {
        Random rdm = new Random();
        int[][] newMatrix = new int[size][size];
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                newMatrix[i][j] = rdm.nextInt(10);
            }
        }

        return newMatrix;
    }

    public static int[][] addMatrix(int[][] matrixA, int matrixB[][]) {
        int[][] newMatrix = new int[matrixA.length][matrixA.length];

        for(int i = 0; i < matrixA.length; i++) {
            for(int j = 0; j < matrixA[i].length; j++) {
                newMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        return newMatrix;
    }

    public static int[][] multiplyMatrix(int[][] matrixA, int matrixB[][]) {
        int[][] newMatrix = new int[matrixA.length][matrixA.length];

        for(int i = 0; i < matrixA.length; i++) {
            for(int j = 0; j < matrixA[i].length; j++) {
                newMatrix[i][j] = crossMultiply(matrixA, matrixB, i, j);
            }
        }
        return newMatrix;
    }

    public static int crossMultiply(int[][] matrixA, int matrixB[][], int row, int col) {
        int tempSum = 0;
        for(int i = 0; i < matrixA.length; i++) {
            tempSum += matrixA[row][i] * matrixB[i][col];
        }
        return tempSum;
    }

    public static void displayMatrix(int[][] matrix) {
        for(int[] x : matrix) {
            for(int y : x) {
                System.out.print(y + " ");
            }
            System.out.println("");
        }
    }

}
