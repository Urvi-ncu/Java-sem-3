import java.util.Scanner;

public class Convert {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Urvi 24csu226");
        System.out.println("Enter the value in Fahrenheit: ");
        
        float valueF = scan.nextInt();
        float valueC;

        valueC = (valueF - 32) * (5.0f / 9.0f);

        System.out.println(valueC + " is the value of " + valueF + " in Celsius");
    }
}
