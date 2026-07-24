import java.util.Scanner;

public class Centimeters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cm : ");
        Double meters = sc.nextDouble();

        Double result = meters / 100;
        
        System.out.printf("%.2f cm equals %.2f meters" , meters , result);
    }
}
