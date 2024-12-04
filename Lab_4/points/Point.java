package Lab_4.points;

public class Point {
    private float x;
    private float y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setLocation(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distanceFromOrigin() {
        return Math.sqrt(Math.pow((x), 2) + Math.pow((y), 2));
    }

    public boolean isInRectangle(Point top_left, Point bottom_right) {
        return x >= top_left.getX() && x <= bottom_right.getX() &&
                y >= top_left.getY() && y <= bottom_right.getY();
    }

    public boolean isInCircle(Point center, int radius) {
        double distance = Math.sqrt(Math.pow(x - center.getX(), 2) + Math.pow(y - center.getY(), 2));
        return distance <= radius;
    }

    public Point midpoint(Point p1, Point p2) {
        float midX = (p1.getX() + p2.getX()) / 2;
        float midY = (p1.getY() + p2.getY()) / 2;
        return new Point(midX, midY);
    }
}