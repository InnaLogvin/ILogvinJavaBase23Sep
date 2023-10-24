package ua.vodafone.homeworks.classes;

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

    public int distanceTo(Point another) { //відстань до іншої точки; відстань = √((x2 - x1)² + (y2 - y1)²)
        return distanceBetween(this, another);
    }

    public int distanceBetween(Point one, Point another) {
        int deltaX = this.x - another.x;
        int deltaY = this.y - another.y;
        return (int) Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "point: (" + x + ", " + y + ")";
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Point a = new Point(4, 5); //точка на площині
        System.out.println("a " + a.toString()); //отримати поточні координати
        Point b = new Point(1, 2);
        System.out.println("b " + b.toString());


        int distanceTo = a.distanceTo(b);
        System.out.println("Distance from a to b: " + distanceTo);

        a.setX(9);
        a.setY(6);
        System.out.println("a " + a.toString()); //отримати поточні координати після зміни координати
        Point fakePoint = new Point(7, 3);

        int distanceBetween = fakePoint.distanceBetween(a, b);
        System.out.println("Distance between a and b: " + distanceBetween);

        boolean equalPoint = a.equals(b);
        System.out.println("Result of comparison points a and b: " + equalPoint);

        Point copiedPoint = new Point(fakePoint);
        System.out.println("Copied fakePoint is " + copiedPoint);

        Point clonedPoint = (Point) fakePoint.clone();
        System.out.println("Cloned fakePoint is " + clonedPoint);

    }
}
