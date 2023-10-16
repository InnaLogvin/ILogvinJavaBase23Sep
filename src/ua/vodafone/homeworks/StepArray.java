package ua.vodafone.homeworks;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class StepArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's create a huge matrix! Enter the dimensions: 1st one is row's, 2nd one is column's: ");
        int rows = scanner.nextInt();
        int maxCols = scanner.nextInt();

        int[][] matrix = generateMatrix(rows, maxCols);
        System.out.println("Let's look at the original matrix:");
        printMatrix(matrix);

        sortMatrixRows(matrix);
        System.out.println("\nLet's look at the sorted matrix:");
        printMatrix(matrix);

        int matrixSum = calculateSum(matrix);
        System.out.println("\nThe sum of all the matrix's elements is: " + matrixSum);

//        int minValue = findMinValue(matrix);
//        System.out.println("\nThe minimum value of matrix is: " + minValue);

        System.out.println("\nHere is your array of the minimum values for every matrix's row: ");
        int[] minRowMatrixValueArray = findMinRowValue(matrix);
        for (int value : minRowMatrixValueArray) {
            System.out.print(value + ", ");
        }
        int matrixMinValue = findMatrixMinimum(minRowMatrixValueArray);
        System.out.println("\n\nThe minimum value of matrix is: " + matrixMinValue);

        divideElementsByMinValue(matrix, matrixMinValue);
        if (matrixMinValue != 0) {
            System.out.println("\nResult after division is: ");
            printMatrix(matrix);
        } else {
            System.out.println("You can't divide by 0!");
        }
    }


    public static int[][] generateMatrix(int rows, int maxCols) {
        int[][] matrix = new int[rows][];

        for (int i = 0; i < rows; i++) {
            int cols = ThreadLocalRandom.current().nextInt(0, maxCols);
            matrix[i] = new int[cols];
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(50);
            }
        }

        return matrix;
    }

    public static void sortMatrixRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) { // Парний рядок
                descendingSort(matrix[i]); //ascending order
            } else { // Непарний рядок
                ascendingSort(matrix[i]); //descending order
            }
        }
    }

    public static void descendingSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j);
                }
            }
        }
    }

    public static void ascendingSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    swap(array, j);
                }
            }
        }
    }

    public static void swap(int[] array, int i) {
        int tmp = array[i];
        array[i] = array[i + 1];
        array[i + 1] = tmp;
    }


    public static int calculateSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }


    public static int[] findMinRowValue(int[][] matrix) {
        int[] minRowValue = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length == 0) {
                minRowValue[i] = 0;
            } else {
                int minValue = matrix[i][0];
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] < minValue) {
                        minValue = matrix[i][j];
                    }
                }
                minRowValue[i] = minValue;
            }

        }
        return minRowValue;
    }

    public static int findMatrixMinimum(int[] array) {
        int minValue = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    public static void divideElementsByMinValue(int[][] matrix, int value) {
        int matrixMinValue = value;
        if (matrixMinValue != 0) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = matrix[i][j] / matrixMinValue;
                }
            }
        } else {
            System.out.println("Oooops... ");
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
