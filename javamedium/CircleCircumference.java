import java.util.Scanner;

public class CircleCircumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius : ");
        double radiaus = sc.nextDouble();

        double result = 2 * Math.PI * radiaus;
        System.out.println("Circumference : %.2f".formatted(result));
        
    }
}
