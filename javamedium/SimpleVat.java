import java.util.Scanner;

public class SimpleVat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the amount : ");
        double amount = sc.nextDouble();

        double vat = 7 / 100.0;
        double result = amount * vat;

        System.out.print("VAT : $%.2f".formatted(result));

        sc.close();
    }
}