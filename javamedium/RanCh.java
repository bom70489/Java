import java.util.Scanner;
import java.util.Random;


public class RanCh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter the String for random char : ");
        String word = sc.next();

        int ranindex = rand.nextInt(word.length());

        char result = word.charAt(ranindex);

        System.out.println("Random Char : " + result);
        sc.close();
    }
}
