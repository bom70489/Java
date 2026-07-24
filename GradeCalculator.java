import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
d
        System.out.print("Enter your score : ");
        int grade = sc.nextInt();
        
        if (grade >= 80) {
            System.out.println("A");
        } else if(grade >= 70) {
            System.out.println("B");
        } else if(grade >= 60) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }
    }
}