import java.util.Scanner;

public class arrsum {
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
        int maxno = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxno) {
                maxno = arr[i];
            }
        }

        System.out.println("maximum no is " + maxno);
    }
}