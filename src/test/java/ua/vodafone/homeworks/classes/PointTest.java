package ua.vodafone.homeworks.classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PointTest {
    private Point a;
    private Point b;
    private double expectedDistance;

    @BeforeEach
    void setUp() {
        a = new Point(4, 5);
        b = new Point(1, 2);
        expectedDistance = 4.242640687119285; // ОР расстояние между a і b
    }

    @Test
    void distanceTo() {
        //given - set up
        //when
        double actualDistance = a.distanceTo(b);
        //then
        Assertions.assertEquals(expectedDistance, actualDistance); // проверка на равность
    }

    @Test
    void distanceBetween() {
        //given - set up
        //when
        double actualDistance = Point.distanceBetween(a, b); // проверка на равность
        //then
        Assertions.assertEquals(expectedDistance, actualDistance);
    }

    @Test
    void testDistanceBetweenNull() {
        Point a = new Point(4, 5);
        Point b = null; // проверка налл

        Assertions.assertThrows(NullPointerException.class, () -> {
            Point.distanceBetween(a, b);
        });

    }
}