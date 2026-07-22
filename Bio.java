import java.util.Scanner;

public class Bio {
    public static void main(String[] args) {
        // input bio
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();

        System.out.print("Enter your hobby : ");
        String hobby = sc.nextLine();

        // output
        System.out.println(name + " love " + hobby + " in his free time");
    }
}
