package Lab_4;

class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static Point midpoint(Point p1, Point p2) {
        int midX = (p1.getX() + p2.getX()) / 2;
        int midY = (p1.getY() + p2.getY()) / 2;
        return new Point(midX, midY);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class Point3D extends Point {
    private int z;

    public Point3D() {
        super();
        this.z = 0;
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public static Point3D midpoint(Point3D p1, Point3D p2) {
        int midX = (p1.getX() + p2.getX()) / 2;
        int midY = (p1.getY() + p2.getY()) / 2;
        int midZ = (p1.getZ() + p2.getZ()) / 2;
        return new Point3D(midX, midY, midZ);
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
}

public class Task4 {
    public static void main(String[] args) {

        Point p1 = new Point(2, 3);
        Point p2 = new Point(4, 7);
        Point midpoint2D = Point.midpoint(p1, p2);
        System.out.println("Середина отрезка между " + p1 + " и " + p2 + " : " + midpoint2D);

        Point3D p3d1 = new Point3D(1, 2, 3);
        Point3D p3d2 = new Point3D(5, 6, 7);
        Point3D midpoint3D = Point3D.midpoint(p3d1, p3d2);
        System.out.println("Середина отрезка между " + p3d1 + " и " + p3d2 + " : " + midpoint3D);
    }
}
