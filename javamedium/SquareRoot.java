import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to square root : ");
        double root = sc.nextDouble();

        double result = Math.sqrt(root);

        if (root < 0) {
            System.out.println("Square root mush be positive");
        } else {
            System.out.println("Square root : %.2f".formatted(result));
        }
    }
} 