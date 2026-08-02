import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Email address : ");
        String email = sc.nextLine();      

        if (email.contains("@")) {

            int atemail = email.indexOf("@");   // Find a index. 
            String domain = email.substring(atemail + 1); // Extract.
            System.out.println("Domain after @ is: " + domain);

        } else {
            System.out.println("This is not an email!");
        }

        sc.close();
    }
}