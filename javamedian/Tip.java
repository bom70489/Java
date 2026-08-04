import java.util.Scanner;

public class Tip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Bill amount and tip percentage : ");
        double bill = sc.nextDouble();
        double tip = sc.nextDouble();

        double caltip = bill * (tip / 100);
        double result = caltip + bill;
        System.out.println("Total : %.2f".formatted(result));
    }
}
