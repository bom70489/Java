import java.util.Random;

public class RanGrade {
    public static void main(String[] args) {
        Random rand = new Random();
        char[] characters = {'A' , 'B' , 'C' , 'D' , 'E' , 'F'};

        int randch = rand.nextInt(characters.length);

        char result = characters[randch];
        System.out.println("Your grade : " + result);

    }
}
