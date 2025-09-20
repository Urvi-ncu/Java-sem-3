import java.util.Scanner;

class Area {
    double length, breadth;

    Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double returnArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        System.out.println("Urvi 24csu226 ");
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        Area a = new Area(length, breadth);
        System.out.println("Area: " + a.returnArea());
    }
}