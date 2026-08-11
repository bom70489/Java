import java.util.Scanner;

public class AverageCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 3 number : ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();

        double result = (num1 + num2 + num3) / 3;
        System.out.println("Average : %.2f".formatted(result));
    }
}