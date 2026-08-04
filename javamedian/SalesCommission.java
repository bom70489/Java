import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total sales : ");
        double sales = sc.nextDouble();
        System.out.print("Enter the commission percentage : ");
        double commission = sc.nextDouble();

        double result = sales * (commission / 100);
        System.out.println("Commission : $%.2f".formatted(result));
    }   
}