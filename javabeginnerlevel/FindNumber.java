import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Enter number three number : ");
        double num1 = sc.nextDouble(); 
        double num2 = sc.nextDouble();   
        double num3 = sc.nextDouble();

        double result;

        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }

        if (result > num3) {
            System.out.println(result);
        } else {
            System.out.println(num3);
        }
    }
}