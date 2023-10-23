package ua.vodafone.homeworks.classes;

public class Point implements PointCalculable {
    private int x;
    private int y;

    public Point(int x, int y) { //конструктор точек
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int distanceTo(Point another) { //відстань до іншої точки; //Відстань = √((x2 - x1)² + (y2 - y1)²)
        int deltaX = this.x - another.x; //можно сделать дабл, но нужно ли?
        int deltaY = this.y - another.y;
        return (int) Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public int distanceBetween(Point one, Point another) { //відстань між двома точками;
        int deltaX = one.x - another.x;
        int deltaY = one.y - another.y;
        return (int) Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    ;

    @Override
    public String toString() {
        return "point: (" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        Point a = new Point(4, 5); //точка на площині
        System.out.println("a " + a.toString()); //отримати поточні координати
        Point b = new Point(1, 2);
        System.out.println("b " + b.toString());


        int distanceTo = a.distanceTo(b);
        System.out.println("Distance from a to b: " + distanceTo);

        a.setX(1);
        a.setY(3);
        System.out.println("a " + a.toString()); //отримати поточні координати після зміни координати

        int distanceBetween = a.distanceBetween(a, b);
        System.out.println("Distance between a and b: " + distanceBetween);

        boolean equalPoint = a.equals(b);
        System.out.println("Result of comparison points a and b: " + equalPoint);
    }
}
