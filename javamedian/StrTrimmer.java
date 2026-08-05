import java.util.Scanner;

public class StrTrimmer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word : ");
        String word = sc.nextLine();
        
        if (word.length() > 2) {
            String result = word.substring(1 , word.length() - 1);
            System.out.println(result);
        } else {
            System.out.println("Enter more than two string.");
        }    
    }
}