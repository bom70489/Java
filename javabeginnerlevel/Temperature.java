import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weather temperature : ");
        double temp = sc.nextDouble();

        System.out.printf("Today's tempreature is %.2f" , temp);
    }
}
