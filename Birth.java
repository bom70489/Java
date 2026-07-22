import java.util.Scanner;

public class Birth {
    public static void main(String[] args) {
        // input birth
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Birth : ");
        int birth = sc.nextInt();
        // cal birth
        int year = 2026;
        int result = year - birth;
        System.out.print("Your are " + result + " years old");
    }
}
