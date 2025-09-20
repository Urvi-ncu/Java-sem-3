import java.util.Scanner;

class Complex {
    double real, imag;

    Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    Complex subtract(Complex c) {
        return new Complex(this.real - c.real, this.imag - c.imag);
    }

    Complex multiply(Complex c) {
        double r = this.real * c.real - this.imag * c.imag;
        double i = this.real * c.imag + this.imag * c.real;
        return new Complex(r, i);
    }

    void print() {
        System.out.println(this.real + " + " + this.imag + "i");
    }

    public static void main(String[] args) {
        System.out.println("Urvi 24csu226");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real1 and imag1: ");
        double real1 = sc.nextDouble();
        double imag1 = sc.nextDouble();
        System.out.print("Enter real2 and imag2: ");
        double real2 = sc.nextDouble();
        double imag2 = sc.nextDouble();

        Complex c1 = new Complex(real1, imag1);
        Complex c2 = new Complex(real2, imag2);

        Complex sum = c1.add(c2);
        Complex diff = c1.subtract(c2);
        Complex prod = c1.multiply(c2);

        System.out.print("Sum: ");
        sum.print();
        System.out.print("Difference: ");
        diff.print();
        System.out.print("Product: ");
        prod.print();
    }
}