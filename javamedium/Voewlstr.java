import java.util.Scanner;

public class Voewlstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Original String : ");
        String word = sc.nextLine();
        String replace = word.replaceAll("[AaEeIiOoUu]" , "a");

        System.out.println("Replaced String : " + replace);
        sc.close();
    }
}
