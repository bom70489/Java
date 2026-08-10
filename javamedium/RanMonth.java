import java.util.Random;

public class RanMonth {
    public static void main(String[] args) {
        String[] months = {"January" , "February" , "March" , "April" , "May" , "June" , "July" , "August" , "September" , "October" , "November" , "December"};

        Random rand = new Random();

        int randomMonth = rand.nextInt(months.length);

        String result = months[randomMonth];
        System.out.print("Month : " + result);
        
    }
}
