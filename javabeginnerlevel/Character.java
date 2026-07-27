import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your String covert to ASCII code : ");
        char[] word = sc.next().toCharArray();

        for(int i = 0; i < word.length; i++) {
            int value = (int) word[i];
            System.out.print(word[i] + " = " + value);
        }
    }
}
