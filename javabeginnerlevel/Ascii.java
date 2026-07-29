import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Character to make ASCII : ");
        char ascii = sc.next().charAt(0);

        int result = (int) ascii;

        System.out.printf("ASCII of %c : %d" , ascii , result);
    }
}