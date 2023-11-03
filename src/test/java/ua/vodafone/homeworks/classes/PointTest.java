package ua.vodafone.homeworks.classes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PointTest {
    private Point a;
    private Point b;

    @BeforeEach
    void setUp() {
        Point a = new Point(4, 5);
        Point b = new Point(1, 2);
    }

    //given - set up


    @Test
    void distanceTo() {
        //when
        double expectedDistance = 4.242640687119285; // ОР расстояние между a і b

        double actualDistance = a.distanceTo(b);
        //then
        assertEquals(expectedDistance, actualDistance, 0.0001); // проверка на равность с дельтой 0.0001
    }

    @Test
    void distanceBetween() {
    }
}