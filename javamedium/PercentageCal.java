import java.util.Scanner;

public class PercentageCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of the value to : ");
        double number = sc.nextDouble();
        System.out.print("Enter the total : ");
        double total = sc.nextDouble();

        double percentage = (number / total) * 100;
        System.out.println("Percentage : %.2f%%".formatted(percentage));
        sc.close();
    }
}
