import java.util.Scanner;

public class Comparestr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the word 1 : ");
        String word1 = sc.nextLine();
        System.out.print("Enter the word 2 : ");
        String word2 = sc.nextLine();
        boolean check = false;

        if(word1.length() != word2.length()) {
            System.out.println(check);
        } else {
            System.out.println(!check);
        }
    }
}
