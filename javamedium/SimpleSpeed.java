import java.util.Scanner;

public class SimpleSpeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Distance : ");
        double distance = sc.nextDouble();
        System.out.print("Enter the time : ");
        double time = sc.nextDouble();

        double speed = distance / time;
        System.out.print("Average Speed : %.2f km/h".formatted(speed));
        
        sc.close();
    }
}
