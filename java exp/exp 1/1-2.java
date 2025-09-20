import java.util.Scanner;

public class Minutes {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Urvi 24csu226 ");
        System.out.println("Enter the minutes: ");
        long minutes = scan.nextLong();

        long years = minutes / 525600;
        long remaining_minutes = minutes % 525600;
        long months = remaining_minutes / 43200;
        remaining_minutes = remaining_minutes % 43200;
        long days = remaining_minutes / 1440;

        System.out.println(minutes + " minutes are " + years + " years " + months + " months " + days + " days");
    }
}
