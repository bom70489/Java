import java.util.Scanner;

public class UsernameFormmat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your first name and last name : ");
        String firstName = sc.next().toLowerCase();
        String lastName = sc.next().toLowerCase();

        System.out.print(firstName + "." + lastName);
    }
}
