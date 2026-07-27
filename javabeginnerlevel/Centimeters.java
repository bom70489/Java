import java.util.Scanner;

public class Centimeters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cm : ");
        int meters = sc.nextInt();

        Double result = (double) meters / 100;
        
        System.out.printf("%d cm equals %.2f meters" , meters , result);
    }
}
