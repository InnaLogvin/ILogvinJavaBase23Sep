package ua.vodafone.homeworks.beforeoop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareArrayTest {
    private int[][] squareMatrix;
    private int[][] notSquareMatrix;
    private double expectedAverage;
    boolean expectedIsSquare;

    @BeforeEach
    void setUp() {
        squareMatrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        notSquareMatrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7}};
        expectedAverage = 5.0;
        expectedIsSquare = true;
    }

    @Test
    void calculateAverageTest() {
        double actualAverage = SquareArray.calculateAverage(squareMatrix);
        assertEquals(expectedAverage, actualAverage);
    }

    @Test
    void isSquareMatrixTest() {
        boolean actualSquare = SquareArray.isSquareMatrix(squareMatrix);
        assertEquals(expectedIsSquare, actualSquare);
    }

    @Test
    void isNotSquareMatrixTest() {
        boolean expectedIsSquare = false;
        boolean actualSquare = SquareArray.isSquareMatrix(notSquareMatrix);
        assertEquals(expectedIsSquare, actualSquare);
    }
}