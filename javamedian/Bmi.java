package javamedian;
import java.util.Scanner;


public class Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your weight and height : ");
        double weight = sc.nextDouble();
        double height = sc.nextDouble();

        double calbmi = weight / Math.pow(height , 2);
        System.out.printf("Your BMI is %.2f" , calbmi);
    }
}
