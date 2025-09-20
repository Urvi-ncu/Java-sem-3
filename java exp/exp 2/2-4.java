import java.util.Scanner;

class Fibonacci {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Urvi 24csu226 ");
        System.out.println("Enter no. of terms for Fibonacci series");
        int n = scan.nextInt();
        int first = 0;
        int second = 1;
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}