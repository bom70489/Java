import java.util.Random;

public class RandomUppercase {
    public static void main(String[] args) {
        Random random = new Random();
        char randomChar = (char) ('A' + random.nextInt(26));
        System.out.println("Letter : " + randomChar);
    }
}
