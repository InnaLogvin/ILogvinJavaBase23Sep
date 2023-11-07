package ua.vodafone.homeworks.beforeoop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareArrayTest {

    @Test
    void calculateAverageTest() {
        double expectedAverage = 5.0;
        double actualAverage = SquareArray.calculateAverage(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        assertEquals(expectedAverage, actualAverage);
    }

    @Test
    void calculateAverageAnotherMatrixTest() {
        double expectedAverage = 3.5;
        double actualAverage = SquareArray.calculateAverage(new int[][]{{1, 2, 3}, {4, 5}, {6}});
        assertEquals(expectedAverage, actualAverage);
    }

    @Test
    void calculateAverageNullMatrixTest() {
        double actualAverage = SquareArray.calculateAverage(null);
        assertTrue(Double.isNaN(actualAverage)); //Not-a-Number, true if average is NaN
    }

    @Test
    void calculateAverageEmptyMatrixTest() {
        double actualAverage = SquareArray.calculateAverage(new int[][]{});
        assertTrue(Double.isNaN(actualAverage)); //Not-a-Number, true if average is NaN
    }

    @Test
    void calculateAverageEmptyValuesMatrixTest() {
        double actualAverage = SquareArray.calculateAverage(new int[][]{{}, {}, {}});
        assertTrue(Double.isNaN(actualAverage));//Not-a-Number, true if average is NaN
    }
    @Test
    void calculateAverageNullValueTest() {
        double actualAverage = SquareArray.calculateAverage(new int[][]{{1, 2, 3}, null, {7, 8, 9}});
        assertTrue(Double.isNaN(actualAverage)); //Not-a-Number, true if average is NaN
    }


    @Test
    void isSquareMatrixTest() {

        assertTrue(SquareArray.isSquareMatrix(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }

    @Test
    void isNotSquareMatrixTest() {

        assertFalse(SquareArray.isSquareMatrix(new int[][]{{1, 2, 3}, {4, 5, 6}, {7}}));
    }

    @Test
    void isNotSquareAnotherMatrixTest() {

        assertFalse(SquareArray.isSquareMatrix(new int[][]{{1, 2, 3}, {4, 5}, {6}}));
    }

    @Test
    void isNullSquareMatrixTest() {

        assertFalse(SquareArray.isSquareMatrix(null));
    }

    @Test
    void isEmptySquareMatrixTest() {

        assertFalse(SquareArray.isSquareMatrix(new int[][]{}));
    }

    @Test
    void isEmptyValuesSquareMatrixTest() {

        assertFalse(SquareArray.isSquareMatrix(new int[][]{{}, {}, {}}));
    }

    @Test
    void isDifferentValuesSquareMatrixTest() {

        assertFalse(SquareArray.isSquareMatrix(new int[][]{{1, 2, 3}, null, {7, 8, 9}}));
    }

}