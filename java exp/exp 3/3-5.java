public class ReverseArrayNew {
    static void reverse(int[] arr, int[] rev, int index) {
        if (index < 0) {
            return;
        }
        rev[arr.length - 1 - index] = arr[index];
        reverse(arr, rev, index - 1);
    }

    public static void main(String[] args) {
        System.out.println("Urvi 24csu226");
        int[] arr = {1, 2, 3, 4, 5};
        int[] rev = new int[arr.length];
        reverse(arr, rev, arr.length - 1);
        System.out.print("Reversed array: ");
        for (int i = 0; i < rev.length; i++) {
            System.out.print(rev[i] + " ");
        }
    }
}