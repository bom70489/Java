import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = sc.next();
        int score = 0;

        if(password.length() >= 8) {
            score = 0;
        }

        boolean number = false;
        boolean capital = false;
        boolean special = false;
 
        for(char ch : password.toCharArray()) {
            if(Character.isDigit(ch)) {
                number = true;
            } else if (Character.isUpperCase(ch)) {
                capital = true;
            } else if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                special = true;
            }
        }

        if(number) {
            score++;
        }

        if(capital) {
            score++;
        }

        if(special) {
            score++;
        }

        if(score >= 3) {
            System.out.println("Strong");
        } else if (score == 2) {
            System.out.println("Medium");
        } else {
            System.out.println("Weak");
        }

        sc.close();

    }
}