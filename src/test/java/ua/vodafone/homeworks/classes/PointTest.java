package ua.vodafone.homeworks.classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PointTest {
    private Point a;
    private Point b;
    private Point c;
    private Point d;
    private double expectedDistance;

    @BeforeEach
    void setUp() {
        a = new Point(3, 4);
        b = new Point(2, 5);
        c = null;
        d = null;
        expectedDistance = 1.4142135623730951; // ОР расстояние между a и b
    }

    @Test
    void distanceToTest() {// проверка на равность расстояния из ОР и из метода
        double actualDistance = a.distanceTo(b);
        Assertions.assertEquals(expectedDistance, actualDistance);
    }

    @Test
    void distanceBetweenTest() {// проверка на равность расстояния из ОР и из метода
        double actualDistance = Point.distanceBetween(a, b);
        Assertions.assertEquals(expectedDistance, actualDistance);
    }

    @Test
    void distanceBetweenNullPointATest() { //точка а = налл, ждем результат -1 как в ритерн

        double actualDistance = Point.distanceBetween(c, b);

        assertEquals(-1, actualDistance);

    }

    @Test
    void distanceToNullPointBTest() {//точка б = налл, ждем результат -1 как в ритерн

        double actualDistance = Point.distanceBetween(a, d);

        assertEquals(-1, actualDistance);
    }

    @Test
    void distanceBetweenNullPointsTest() { //обе точки налл, ждем результат -1 как в ритерн

        double actualDistance = Point.distanceBetween(c, d);

        assertEquals(-1, actualDistance);
    }


}