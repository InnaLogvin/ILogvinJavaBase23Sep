package ua.vodafone.homeworks.classes;

import java.util.Objects;

public class Point implements PointCalculable, Cloneable {
    private int x;
    private int y;

    public Point(int x, int y) { //конструктор точек
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        x = point.x;
        y = point.y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distanceTo(Point another) { //відстань до іншої точки; відстань = √((x2 - x1)² + (y2 - y1)²)
        return distanceBetween(this, another);
    }

    public double distanceBetween(Point one, Point another) {
        double deltaX = this.x - another.x;
        double deltaY = this.y - another.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point other = (Point) obj;
        return x == other.x && y == other.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public Point clone() throws CloneNotSupportedException {
        return (Point) super.clone();
    }

    @Override
    public String toString() {
        return "point: (" + x + ", " + y + ")";
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Point a = new Point(4, 5); //точка на площині
        System.out.println("a " + a); //отримати поточні координати
        Point b = new Point(1, 2);
        System.out.println("b " + b);


        double distanceTo = a.distanceTo(b);
        System.out.println("Distance from a to b: " + distanceTo);

        a.setX(9);
        a.setY(6);
        System.out.println("a " + a); //отримати поточні координати після зміни координати

        System.out.println("Distance between a and b: " + a.distanceBetween(a, b));

        boolean areDifferent = a == b;
        System.out.println("\nAre a and b the same objects? " + areDifferent);//ОР - false, т.к. объекты разные, значения равны

        boolean equalPoint = a.equals(b);
        System.out.println("Result of comparison the coordinates a and b: " + equalPoint); //ОР - false, т.к. сравниваем координаты


        Point copiedPoint = new Point(a);
        System.out.println("\nCopied fakePoint is " + copiedPoint);

        boolean equalCopiedObjects = copiedPoint == a;
        System.out.println("Are copiedPoint and a the same objects? " + equalCopiedObjects); //ОР - false, т.к. объекты разные, значения равны

        boolean equalCopiedValues = copiedPoint.equals(a);
        System.out.println("Result of comparison the coordinates copiedPoint and a: " + equalCopiedValues); //ОР - true, т.к. сравниваем координаты

        Point clonedPoint = a.clone();
        System.out.println("\nCloned fakePoint is " + clonedPoint);

        boolean equalClonedObjects = copiedPoint == a;
        System.out.println("Are clonedPoint and a the same objects? " + equalClonedObjects); //ОР - false, т.к. объекты разные, значения равны

        boolean equalClonedValues = copiedPoint.equals(a);
        System.out.println("Result of comparison the coordinates clonedPoint and a: " + equalClonedValues); //ОР - true, т.к. сравниваем
    }
}
