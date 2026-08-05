import java.util.Scanner;


public class Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the USD : ");
        double currency = sc.nextDouble();
        System.out.print("Enter the exchange rate : ");
        double exchange = sc.nextDouble();

        double result = currency * exchange;

        System.out.printf("€%.2f" , result);
    }
}
