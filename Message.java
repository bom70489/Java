import java.util.Scanner;

public class Message {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();

        System.out.print("Welcome! " + name + "\nEnjoy your stay at ChatHub");
    }
}