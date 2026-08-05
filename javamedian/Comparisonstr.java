import java.util.Scanner;

public class Comparisonstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First Word : ");
        String word1 = sc.nextLine();
        System.out.print("Second Word : ");
        String word2 = sc.nextLine();

        int firstChar1 = (int) word1.charAt(0);
        int firstChar2 = (int) word2.charAt(0);

        if(firstChar1 >= firstChar2 || firstChar1 <= firstChar2) {
            int calchar = (int) firstChar1 - firstChar2; 
            System.out.println(calchar);   
        }

    }
}