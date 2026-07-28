import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your area of circle : ");
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;

        System.out.printf("Area : %.2f" , area);
    }
}
