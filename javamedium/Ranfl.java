public class Ranfl {
    public static void main(String[] args) {
        
        int min = 0;
        int max = 1;

        double result =  (Math.random() * (max - min)) + min;
        System.out.print("Random float : %.2f".formatted(result));
        
    }
}