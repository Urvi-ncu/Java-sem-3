import java.util.Scanner;

public class Searchelement {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Urvi 24csu226 ");
        int n;
        System.out.println(" enter n ");
        n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Enter the number to search");
        int m = scan.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == m) {
                System.out.println("ELEMENT IS PRESENT");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("ELEMENT NOT PRESENT");
        }
    }
}