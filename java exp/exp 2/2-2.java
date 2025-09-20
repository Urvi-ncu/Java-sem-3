import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Urvi 24csu226 ");
        System.out.println("Quadratic equation: ax^2 + bx + c = 0");
        System.out.println("Enter value of a:");
        double a = sc.nextDouble();
        System.out.println("Enter value of b:");
        double b = sc.nextDouble();
        System.out.println("Enter value of c:");
        double c = sc.nextDouble();
        double discriminant = b * b - 4 * a * c;

        // Case 1: Two real and distinct roots
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are Real and Distinct:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        }
        // Case 2: Two real and equal roots
        else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The roots are Real and Equal:");
            System.out.println("Root = " + root);
        }
        // Case 3: Complex roots
        else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("The roots are Imaginary (Complex):");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }
    }
}