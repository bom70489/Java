import java.util.Scanner;

public class IdGenerating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Full name : ");
        String fName = sc.next();
        String lName = sc.next();

        char firstChar = fName.charAt(0);
        char lastNameChar = lName.charAt(0);

        System.out.println(firstChar + "" + lastNameChar);
        
        sc.close();
    }
}
