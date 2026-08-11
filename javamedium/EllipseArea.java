import java.util.Scanner;

public class EllipseArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter semi-major axis (a) : ");
        double a = sc.nextDouble();
        System.out.print("Enter semi-minor axis (b) : ");
        double b = sc.nextDouble();
        
        double result = Math.PI * a * b;
        System.out.println("Ellipse Area : %.2f".formatted(result));
        sc.close();
    }
}
