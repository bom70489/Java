import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sphere of circle : ");
        double sphere = sc.nextDouble();

        double volume = 4 * (Math.PI * Math.pow(sphere, 3)) / 3;
        System.out.printf("Volume : %.2f" , volume);
        
        
    }
}