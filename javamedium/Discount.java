import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Original Price : ");
        double price = sc.nextDouble();
        System.out.print("Discount Rate : ");
        double discount = sc.nextDouble();

        double result = price * (discount / 100);
        System.out.println("Discount : $%.2f".formatted(result));
        sc.close();
    }
}
