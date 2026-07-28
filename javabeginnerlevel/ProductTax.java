import java.util.Scanner;

public class ProductTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product price and tax : ");
        double product = sc.nextInt();
        double tax = sc.nextInt();

        double calTax = product * (tax / 100);
        double totalprice = product + calTax;

        System.out.printf("Final Price : %.2f" , totalprice);

        sc.close();
    }
}
