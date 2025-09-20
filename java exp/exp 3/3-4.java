import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Urvi 24csu226 ");
        System.out.print("Enter the number of elements: ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }
        int altSum = 0;
        for (int i = 0; i < n; i += 2) {
            altSum += arr[i];
        }
        System.out.println("Sum of all elements: " + totalSum);
        System.out.println("Sum of alternate elements: " + altSum);
    }
}