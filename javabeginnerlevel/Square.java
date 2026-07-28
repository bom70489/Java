import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number for calculate square and cube : ");
        int num = sc.nextInt();

        int square = num * num;
        int cube = num * num * num;

        System.out.println("Square : " + square);
        System.out.println("Cube : " + cube);
    }
}
