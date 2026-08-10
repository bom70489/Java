import java.util.Scanner;

public class Degrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the degrees number : ");
        float degrees = sc.nextFloat();

        float radians = (float) Math.toRadians(degrees);
        float result = (float) Math.sin(radians);
        System.out.print("Sine : %.2f" .formatted(result));
        sc.close();
    }
}