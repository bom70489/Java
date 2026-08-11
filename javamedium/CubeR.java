import java.util.Scanner;

public class CubeR {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
     
        System.out.print("Enter the number : ");
        double number = sc.nextDouble();

        double result = Math.cbrt(number);

        System.out.printf("Cube Root : %.2f" , result);
        sc.close();
    }
}
