public class NumberRan {
    public static void main(String[] args) {
        int min = 5;
        int max = 15;

        int randomNum = (int) (Math.random() * (max - min + 1)) + min; 
        System.out.println("Random Integer : " + randomNum);
    }
}
