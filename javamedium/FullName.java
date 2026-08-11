import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        System.out.print("Enter FirstName and LastName : ");
        String firstname = sc.next();
        String lastname = sc.next();

        System.out.println(lastname + ", " + firstname);
        sc.close();
    }
}
