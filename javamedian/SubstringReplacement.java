import java.util.Scanner;

public class SubstringReplacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sentense : ");
        String sentense = sc.nextLine();

        System.out.print("Word to replace : ");
        String wordRe = sc.nextLine();

        System.out.print("New word to replace : ");
        String wordNew = sc.nextLine();

        String updated = sentense.replace(wordRe, wordNew);

        System.out.printf("\"%s\"" , updated);
    }
}