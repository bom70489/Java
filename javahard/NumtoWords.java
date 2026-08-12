import java.util.Scanner;

public class NumtoWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String result = "";
        int divide = num / 10;
        int mod = num % 10;

        // start from eleven;
            switch (num) {
                case 11:
                    result = "Eleven";
                    break;
                case 12:
                    result = "Twelve";
                    break;
                case 13:
                    result = "Thirteen";
                    break;
                case 14:
                    result = "fourteen";
                    break;
                case 15:
                    result = "fifteen";
                    break;
                case 16:
                    result = "Sixteen";
                    break;
                case 17:
                    result = "Seventeen";
                    break;
                case 18:
                    result = "Eighteen";
                    break;
                case 19:
                    result = "Nineteen";
                    break;
            }
        

        // find divide 
        switch (divide) {
            case 2:
                result = "Twenty";
                break;
            case 3:
                result = "Thirty";
                break;
            case 4:
                result = "Fourty";
                break;
            case 5:
                result = "Fifty";
                break;
            case 6:
                result = "Sixty";
                break;
            case 7:
                result = "Seventy";
                break;
            case 8:
                result = "Eighty";
                break;
            case 9:
                result = "Ninety";
                break;
        }

        // Find mod
        if(num >= 11 & num <= 19) {
            result += "";
        } else {
            switch (mod) {
                case 1:
                    result += " One";
                    break;
                case 2:
                    result += " Two";
                    break;
                case 3:
                    result += " Three";
                    break;
                case 4:
                    result += " Four";
                    break;
                case 5:
                    result += " Five";
                    break;
                case 6:
                    result += " Six";
                    break;
                case 7:
                    result += " Seven";
                    break;
                case 8:
                    result += " Eight";
                    break;
                case 9:
                    result += " Nine";
                    break;
            }
        }

        System.out.printf("\"%s\"" , result);

        sc.close();
    }
}
