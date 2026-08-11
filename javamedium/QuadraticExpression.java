import java.util.Scanner;

public class QuadraticExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter value of b : ");
        int b = sc.nextInt();
        System.out.print("Enter value of c : ");
        int c = sc.nextInt();
        System.out.print("Enter value of x : ");
        int x = sc.nextInt();

        double result = a * Math.pow(x, 2) + b * x + c;
        System.out.println("Result : %.0f".formatted(result));
    }
}
