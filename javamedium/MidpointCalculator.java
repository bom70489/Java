import java.util.Scanner;

public class MidpointCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Point x1 and y1 : ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Point x2 and y2 : ");
        double x2  = sc.nextDouble();
        double y2  = sc.nextDouble();

        double result1 = (x1 + x2) / 2;
        double result2 = (y1 + y2) / 2;
        System.out.println("Midpoint: (%.1f , %.1f)".formatted(result1 , result2));
    }
}