import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value : ");

        int absolute = sc.nextInt();
        int result = Math.abs(absolute);
        
        System.out.println("Absolute : " + result);
    }
}
