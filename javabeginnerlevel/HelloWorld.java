import java.util.Scanner;

public class HelloWorld { // class Header , can not set name = main 
    //class body
    public static void main(String[] args) { // method header
        // method body
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Hello to GameWorld " + name);
    }
}