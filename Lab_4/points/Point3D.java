package Lab_4.points;

class Point3D extends Point {
    private float z;

    public Point3D() {
        super();
        this.z = 0;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public void setLocation(float x, float y, float z) {
        super.setLocation(x, y);
        this.z = z;
    }

    @Override
    public void setLocation(float x, float y) {
        super.setLocation(x, y);
        this.z = 0;
    }

    public float getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }

    @Override
    public double distanceFromOrigin() {
        return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2) + Math.pow(getZ(), 2));
    }

    public boolean isInBox(Point3D corner1, Point3D corner2) {
        float minX = Math.min(corner1.getX(), corner2.getX());
        float maxX = Math.max(corner1.getX(), corner2.getX());
        float minY = Math.min(corner1.getY(), corner2.getY());
        float maxY = Math.max(corner1.getY(), corner2.getY());
        float minZ = Math.min(corner1.getZ(), corner2.getZ());
        float maxZ = Math.max(corner1.getZ(), corner2.getZ());

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

    @Override
    public Point3D midpoint(Point p1, Point p2) {
        if (p1 instanceof Point3D && p2 instanceof Point3D) {
            Point3D p3D1 = (Point3D) p1;
            Point3D p3D2 = (Point3D) p2;

            float midX = (p3D1.getX() + p3D2.getX()) / 2;
            float midY = (p3D1.getY() + p3D2.getY()) / 2;
            float midZ = (p3D1.getZ() + p3D2.getZ()) / 2;
            return new Point3D(midX, midY, midZ);
        } else {
            throw new IllegalArgumentException("Points must be of type Point3D.");
        }
    }

}
