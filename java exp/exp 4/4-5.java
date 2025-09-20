import java.util.Scanner;

public class Point {
    private float x;
    private float y;

    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public static double distance(Point p1, Point p2) {
        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void display() {
        System.out.printf("(%.2f, %.2f)\n", x, y);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Urvi 24csu226");
        System.out.print("Enter x1 and y1: ");
        float x1 = scanner.nextFloat();
        float y1 = scanner.nextFloat();
        System.out.print("Enter x2 and y2: ");
        float x2 = scanner.nextFloat();
        float y2 = scanner.nextFloat();

        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        System.out.print("Point 1: ");
        p1.display();
        System.out.print("Point 2: ");
        p2.display();

        double dist = Point.distance(p1, p2);
        System.out.printf("Distance between points: %.2f\n", dist);
        scanner.close();
    }
}