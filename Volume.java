import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Disk label : ");
        String disk = sc.nextLine();

        System.out.print("Enter the size of the disk : ");
        double size = sc.nextDouble();

        System.out.printf("%s has %.2f GB of storage." , disk , size);

    }
}