package tech_tasks;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleTask {

    /*

    Given 3 sets of coordinates that form a triangle, calculate the area of the triangle.

    The area of a triangle is (base * height)/2 square units.

    If a line has a slope of dy/dx, its perpendicular has a slope of -dx/dy.

     */

    // Нужно рассчитать площадь треугольника

    @Test
    public void TriangleTest() {
        List<Integer> x = List.of(0, 4, 7);
        List<Integer> y = List.of(0, 8, 6);

        calculateTriangleArea(x, y);
    }

    @Test
    public void TriangleAreaTest() {
        List<Integer> x = List.of(0, 4, 7);
        List<Integer> y = List.of(0, 8, 6);

        int expectedArea = 16;

        assertEquals(expectedArea, calculateTriangleArea(x, y));
    }

    @Test
    public void TriangleAreaExceptionTest() {
        List<Integer> x = List.of(0, 4);
        List<Integer> y = List.of(0, 8);

        Exception thrown = assertThrows(IllegalArgumentException.class, () -> calculateTriangleArea(x, y));
        assertTrue(thrown.getMessage().contains("Collection should consist of three values for x and y"));
    }

    @Test
    public void TriangleAreaExceptionTest2() {
        List<Integer> x = List.of(0, 4, 7, 8);
        List<Integer> y = List.of(0, 8, 6, 6);

        Exception thrown = assertThrows(IllegalArgumentException.class, () -> calculateTriangleArea(x, y));
        assertTrue(thrown.getMessage().contains("Collection should consist of three values for x and y"));
    }

    @Test
    public void NotTriangleTest() {
        List<Integer> x = List.of(0, 0, 0);
        List<Integer> y = List.of(0, 0, 0);

        Exception thrown = assertThrows(IllegalArgumentException.class, () -> calculateTriangleArea(x, y));
        assertTrue(thrown.getMessage().contains("This is not a triangle"));
    }

    @Test
    public void NullCoordinatesTriangleTest() {
        List<Integer> x = new ArrayList<>();
        x.add(null);
        x.add(null);
        x.add(null);
        List<Integer> y = new ArrayList<>();
        y.add(null);
        y.add(null);
        y.add(null);

        Exception thrown = assertThrows(IllegalArgumentException.class, () -> calculateTriangleArea(x, y));
        assertTrue(thrown.getMessage().contains("Coordinates cannot be null"));
    }

    @Test
    public void NullCollectionTriangleTest() {

        Exception thrown = assertThrows(IllegalArgumentException.class, () -> calculateTriangleArea(null, null));
        assertTrue(thrown.getMessage().contains("Collection cannot be null"));
    }

    public static int calculateTriangleArea(List<Integer> X, List<Integer> Y) {

        if (X == null || Y == null) {
            throw new IllegalArgumentException("Collection cannot be null");
        }

        for (int i = 0; i < X.size(); i++) {
            for (int j = 0; j < Y.size(); j++) {
                if (X.get(i) == null || Y.get(j) == null) {
                    throw new IllegalArgumentException("Coordinates cannot be null");
                }
            }
        }

        if (X.size() != 3 && Y.size() != 3) {
            throw new IllegalArgumentException("Collection should consist of three values for x and y");
        }

        String s = X.get(0) + "" + Y.get(0);
        String s1 = X.get(1) + "" + Y.get(1);
        String s2 = X.get(2) + "" + Y.get(2);

        if (s.equals(s1) || s.equals(s2)) {
            throw new IllegalArgumentException("This is not a triangle");
        }

        double AB = Math.sqrt(Math.pow(X.get(1) - X.get(0), 2) + Math.pow(Y.get(1) - Y.get(0), 2));
        double BC = Math.sqrt(Math.pow(X.get(2) - X.get(1), 2) + Math.pow(Y.get(2) - Y.get(1), 2));
        double AC = Math.sqrt(Math.pow(X.get(2) - X.get(0), 2) + Math.pow(Y.get(2) - Y.get(0), 2));

        double p = (AB + BC + AC) / 2;

        double Area = Math.sqrt(p * (p - AB) * (p - BC) * (p - AC));

        int value = (int)Area;
        System.out.println(value);

        return value;
    }
}
