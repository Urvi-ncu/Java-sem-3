class Triangle {
    double side1, side2, side3;

    Triangle() {
        side1 = 3;
        side2 = 4;
        side3 = 5;
    }

    double getPerimeter() {
        return side1 + side2 + side3;
    }

    double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static void main(String[] args) {
        System.out.println("Urvi 24csu226 ");
        Triangle t = new Triangle();
        System.out.println("Area: " + t.getArea());
        System.out.println("Perimeter: " + t.getPerimeter());
    }
}