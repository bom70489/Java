import java.util.Scanner;

public class Casestr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the single word to change to the upper or lower : ");
        char single = sc.next().charAt(0);

        if (single == Character.toUpperCase(single)) {
            char result = Character.toLowerCase(single);
            System.out.println(result);
        } else {
            char result = Character.toUpperCase(single);
            System.out.println(result);
        }
    }
}
