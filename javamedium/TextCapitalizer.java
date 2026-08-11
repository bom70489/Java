import java.util.Scanner;

public class TextCapitalizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the word : ");
        String word = sc.next();

        String capitalizer = word.substring(0 , 1).toUpperCase() + word.substring(1);
        System.out.println(capitalizer);
           
    }
}