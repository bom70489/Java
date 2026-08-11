import java.util.Scanner;

public class Substr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first word1 : ");
        String word1 = sc.next();
        System.out.print("Enter the first word2 : ");
        String word2 = sc.next();

        String merged_word1 = word1.substring(1);
        String merged_word2 = word2.substring(1);
        
        System.out.println(merged_word1 + merged_word2);
    }
}
