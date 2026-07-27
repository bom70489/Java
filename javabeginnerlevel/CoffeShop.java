import java.util.Scanner;

public class CoffeShop {
    public static void main(String[] args1) {
        // read the price and quantity
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your price : ");
        double price = sc.nextDouble();

        System.out.print("Enter your quantity : ");
        int quantity = sc.nextInt();

        // calculate price * quantity
        double total = price * quantity;

        // print total
        System.out.printf("Your price is : %.2f" , total);
    }
}
