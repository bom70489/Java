import java.util.Scanner;

public class DegreestoRadians {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter degress to change into radians : ");
        double degress = sc.nextDouble();

        double radians = Math.toRadians(degress);
        System.out.println("Radians : %.4f".formatted(radians));
    }
}