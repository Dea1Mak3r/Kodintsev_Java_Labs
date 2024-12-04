package Lab_4.points;

public class mainPoint
{
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(8, 16);
        System.out.println("Point1: " + p1);
        System.out.println("Point2: " + p2);
        System.out.println("Расстояние от начала координат: " + p1.distanceFromOrigin());

        Point3D p3d1 = new Point3D(3, 4, 5);
        System.out.println("Point3D: " + p3d1);
        System.out.println("Расстояние от начала координат: " + p3d1.distanceFromOrigin());

        Point3D boxCorner1 = new Point3D(0, 0, 0);
        Point3D boxCorner2 = new Point3D(10, 10, 10);
        System.out.println("\nIs point in box: " + p3d1.isInBox(boxCorner1, boxCorner2));

        Point3D sphereCenter = new Point3D(0, 0, 0);
        int radius = 10;
        System.out.println("Is point in sphere: " + p3d1.isInSphere(sphereCenter, radius));

        System.out.println("\nВычисление середины отрезка:");
        System.out.println("\nВ двухмерном пространстве:");
        Point midpoint2d = p1.midpoint(p1, p2);
        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);
        System.out.println("Середина отрезка: " + midpoint2d);

        System.out.println("\nВ трёхмерном пространстве:");
        Point3D p3d2 = new Point3D(6, 8, 12);
        Point3D midpoint3d = p3d1.midpoint(p3d1, p3d2);
        System.out.println("Point 1: " + p3d1);
        System.out.println("Point 2: " + p3d2);
        System.out.println("Середина отрезка: " + midpoint3d);
    }
}
