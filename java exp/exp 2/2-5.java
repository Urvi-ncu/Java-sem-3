import java.util.Scanner;

class Prime {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Urvi 24csu226 ");
        System.out.println("Enter the number:");
        int x = scan.nextInt();
        boolean n = true;
        if (x <= 1) {
            n = false;
        } else {
            for (int i = 2; i <= (x / 2); i++) {
                if (x % i == 0) {
                    n = false;
                    break;
                }
            }
        }
        if (n) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }
    }
}