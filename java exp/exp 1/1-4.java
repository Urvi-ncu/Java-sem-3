import java.util.Scanner;

class SumOfDigits {
    int sumDigits(int n) {
        if (n == 0)
            return 0;
        return n % 10 + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println("Urvi 24csu226");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        SumOfDigits s = new SumOfDigits();
        System.out.println("Sum of digits: " + s.sumDigits(number));
    }
}
