import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Fahrebheit : ");
        double fahrenheit = sc.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Celsius : %.2f".formatted(celsius));

    }
}