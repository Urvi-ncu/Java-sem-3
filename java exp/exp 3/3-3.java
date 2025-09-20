import java.util.Scanner;

public class RemoveDuplicatesEasy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Urvi 24csu226 ");
        System.out.print("Enter number of elements: ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < n; i++) {
            boolean duplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}