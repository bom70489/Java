import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the x1 and y1 : ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.print("Enter the x2 and y2 : ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance1 = x2 - x1;
        double distance2 = y2 - y1;

        double pow1 = Math.pow(distance1, 2);
        double pow2 = Math.pow(distance2, 2);

        double addition = pow1 + pow2;

        double result = Math.sqrt(addition);
        
        System.out.printf("Distance : %.2f" , result);

        sc.close();
    }
}