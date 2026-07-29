import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your interest : ");
        double priciple = sc.nextDouble();
        double rate = sc.nextDouble();
        double time =  sc.nextDouble();

        double interest = priciple * (rate / 100) * time;
        System.out.println("Interest : " + interest);
    }
}