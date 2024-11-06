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

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    public boolean isInRectangle(Point top_left, Point bottom_right) {
        return x >= top_left.getX() && x <= bottom_right.getX() &&
               y >= top_left.getY() && y <= bottom_right.getY();
    }

    public boolean isInCircle(Point center, int radius) {
        double distance = Math.sqrt(Math.pow(x - center.getX(), 2) + Math.pow(y - center.getY(), 2));
        return distance <= radius;
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

    public void setLocation(int x, int y, int z) {
        super.setLocation(x, y);
        this.z = z;
    }

    @Override
    public void setLocation(int x, int y) {
        super.setLocation(x, y);
        this.z = 0;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }

    @Override
    public double distanceFromOrigin() {
        return Math.sqrt(getX() * getX() + getY() * getY() + z * z);
    }

    public boolean isInBox(Point3D corner1, Point3D corner2) {
        int minX = Math.min(corner1.getX(), corner2.getX());
        int maxX = Math.max(corner1.getX(), corner2.getX());
        int minY = Math.min(corner1.getY(), corner2.getY());
        int maxY = Math.max(corner1.getY(), corner2.getY());
        int minZ = Math.min(corner1.getZ(), corner2.getZ());
        int maxZ = Math.max(corner1.getZ(), corner2.getZ());

        return getX() >= minX && getX() <= maxX &&
               getY() >= minY && getY() <= maxY &&
               z >= minZ && z <= maxZ;
    }

    public boolean isInSphere(Point3D center, int radius) {
        double distance = Math.sqrt(Math.pow(getX() - center.getX(), 2) +
                                    Math.pow(getY() - center.getY(), 2) +
                                    Math.pow(z - center.getZ(), 2));
        return distance <= radius;
    }

    public static void main(String[] args) {
        Point p = new Point(3, 4);
        System.out.println("Point: " + p);
        System.out.println("Distance from origin: " + p.distanceFromOrigin());

        Point3D p3d = new Point3D(3, 4, 5);
        System.out.println("Point3D: " + p3d);
        System.out.println("Distance from origin: " + p3d.distanceFromOrigin());

        Point3D boxCorner1 = new Point3D(0, 0, 0);
        Point3D boxCorner2 = new Point3D(10, 10, 10);
        System.out.println("Is point in box: " + p3d.isInBox(boxCorner1, boxCorner2));

        Point3D sphereCenter = new Point3D(0, 0, 0);
        int radius = 10;
        System.out.println("Is point in sphere: " + p3d.isInSphere(sphereCenter, radius));
    }
}
