package ua.vodafone.homeworks.beforeoop;

public class SquareArray {


    public static double calculateAverage(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return Double.NaN;
        }
        int sum = 0;
        int totalElements = 0;
        boolean isNan = false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] != null) {
                for (int j = 0; j < matrix[i].length; j++) {
                    sum += matrix[i][j];
                    totalElements++;
                }
            } else {
                isNan = true;
                break;
            }
        }
        return isNan ? Double.NaN : (double) sum / totalElements;
    }


    public static boolean isSquareMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        int rows = matrix.length;
        for (int[] row : matrix) {
            if (row == null || row.length != rows) {
                return false;
            }
        }

        return true;
    }
}
