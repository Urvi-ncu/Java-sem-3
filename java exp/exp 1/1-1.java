import java.util.Scanner;

class Operators {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a, b, choice;

        a = scan.nextInt();
        b = scan.nextInt();

        System.out.println("Enter choice 1/2/3/4/5");
        choice = scan.nextInt();

        if (choice == 1) {
            System.out.println("The sum is " + (a + b));
        } else if (choice == 2) {
            System.out.println(b - a);
        } else if (choice == 3) {
            System.out.println(a * b);
        } else if (choice == 4) {
            System.out.println(a / b);
        } else if (choice == 5) {
            System.out.println(a % b);
        } else {
            System.out.println("Invalid choice");
        }
    }
}
