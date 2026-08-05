import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Priciple : ");
        double priciple = sc.nextDouble();
        System.out.print("Rate : ");
        double rate  = sc.nextDouble();
        System.out.print("Period : ");
        double period = sc.nextDouble();

        double interest = 1 + (rate / 100);
        double amount = priciple * Math.pow(interest , period);
        System.out.println("Amount : %.2f".formatted(amount));
    }
}
