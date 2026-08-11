import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius : ");
        double radius = sc.nextDouble();
        System.out.print("Enter the height : ");
        double height = sc.nextDouble();
        
        double result = Math.PI * Math.pow(radius , 2) * height;
        System.out.println("Volume : %.2f".formatted(result));
    }
}
