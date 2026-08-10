public class Rande {
    public static void main(String[] args) {
        int min = 1;
        int max = 10;

        double result = (Math.random() * (max - min)) + min;
        System.out.print("Random number : %.2f".formatted(result));
    }   
} 
