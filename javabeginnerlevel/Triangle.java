import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the triangle hypotenuse : ");
        double length1 = sc.nextDouble();
        double length2 = sc.nextDouble();

        double cal1 = Math.pow(length1 , 2);
        double cal2 = Math.pow(length2 , 2);
        
        double allnum = cal1 + cal2;
        double result = Math.sqrt(allnum);

        System.out.println("Hypotenuse : " + result);
    }
}
