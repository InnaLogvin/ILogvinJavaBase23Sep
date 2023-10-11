package ua.vodafone.homeworks;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's create a lovely matrix! Enter the dimensions: 1st one is row's, 2nd one is column's: ");
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        int[][] matrix = fillMatrix(row, column);
        int[][] reversedMatrix = transposeMatrix(matrix);
        System.out.println("It's a magic! Look at your transposed matrix: ");

        for (int i = 0; i < reversedMatrix.length; i++) {
            print(reversedMatrix[i]);
            System.out.println();
        }
    }

    public static int[][] fillMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(50);
            }
        }

        return matrix;
    }

    public static void print(int[] array) {
        for (int value : array) {
            System.out.print(value + ", ");
        }

    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposedMatrix = new int[cols][rows]; //тут вносятся значения наоборот, количество столбцов в рядки и тд

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];//обмен значений исходной матрицы и перевернутой
            }
        }
        return transposedMatrix;
    }

}
