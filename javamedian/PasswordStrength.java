import java.util.Scanner;

public class PasswordStrength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the password : ");
        String password =  sc.nextLine();

        if(password.length() >= 8) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
