package ua.vodafone.homeworks.classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PointTest {
    private final double EXPECTED_DISTANCE = 1.4142135623730951;
    private Point aPoint;
    private Point bPoint;

    @BeforeEach
    void setUp() {
        aPoint = new Point(3, 4);
        bPoint = new Point(2, 5);
    }

    @Test
    void distanceToTest() {// проверка на равность расстояния из ОР и из метода
        double actualDistance = aPoint.distanceTo(bPoint);
        Assertions.assertEquals(EXPECTED_DISTANCE, actualDistance);
    }

    @Test
    void distanceToNullTest() { //точка another = null, ждем результат -1 как в ритерн

        double actualDistance = aPoint.distanceTo(null);

        assertEquals(-1, actualDistance);

    }

    @Test
    void distanceBetweenTest() {// проверка на равность расстояния из ОР и из метода
        double actualDistance = Point.distanceBetween(aPoint, bPoint);
        Assertions.assertEquals(EXPECTED_DISTANCE, actualDistance);
    }

    @Test
    void distanceBetweenNullPointATest() { //точка а = налл, ждем результат -1 как в ритерн

        double actualDistance = Point.distanceBetween(null, bPoint);

        assertEquals(-1, actualDistance);

    }

    @Test
    void distanceToNullPointBTest() {//точка б = налл, ждем результат -1 как в ритерн

        double actualDistance = Point.distanceBetween(aPoint, null);

        assertEquals(-1, actualDistance);
    }

    @Test
    void distanceBetweenNullPointsTest() { //обе точки налл, ждем результат -1 как в ритерн

        double actualDistance = Point.distanceBetween(null, null);

        assertEquals(-1, actualDistance);
    }


}