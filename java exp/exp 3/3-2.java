import java.util.Scanner;

public class SeparateEvenOdd {
    public static void main(String[] args) {
        System.out.println("Urvi 24csu226");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        int evenArr[] = new int[evenCount];
        int oddArr[] = new int[oddCount];
        int eIndex = 0, oIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenArr[eIndex++] = arr[i];
            } else {
                oddArr[oIndex++] = arr[i];
            }
        }
        System.out.println("Length of array: " + arr.length);
        System.out.println("Even numbers array:");
        for (int i = 0; i < evenArr.length; i++) {
            System.out.print(evenArr[i] + " ");
        }
        System.out.println("\nOdd numbers array:");
        for (int i = 0; i < oddArr.length; i++) {
            System.out.print(oddArr[i] + " ");
        }
    }
}