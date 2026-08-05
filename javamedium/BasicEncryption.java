import java.util.Scanner;

public class BasicEncryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input some letter : ");
        char ascii =  sc.next().charAt(0);

        System.out.println("Encrypted : " + (char)(ascii + 1));
    }
}