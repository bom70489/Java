import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your store name : ");
        String name = sc.nextLine();

        System.out.print("Enter the location : ");
        String location = sc.nextLine();

        for(int i = 1; i <= 10; i++) {
            System.out.print("*");
            if (i == 10) {
                System.out.print(" " + name + " - " + location + " ");
                for (int j = 1; j <= 10; j++) {
                    System.out.print("*");
                }
            }
        }
    }
}