import java.util.Scanner;

public class NumberCo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 number for compare : ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();

        double max , min;

        if (num1 > num2) {
            max = num1;
            min = num2;
        } else {
            max = num2;
            min = num1;
        }

        max = (max > num3) ? max : num3;
        min = (min > num3) ? num3 : min;
        System.out.println("Largest : " + max);
        System.out.println("Smallest : " + min);
        sc.close();
    }
}
