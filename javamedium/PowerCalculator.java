import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base number for exponent : ");
        double base = sc.nextDouble();
        System.out.print("Enter the exponent : ");
        double exponent = sc.nextDouble();

        double result = Math.pow(base, exponent);
        System.out.println("Result : %.1f".formatted(result));
    }   
}