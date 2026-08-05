public class Even {
    public static void main(String[] args) {
        int even = (int) (Math.random() * 100) + 1;
        
        while (even % 2 != 0) {
            even = (int) (Math.random() * 100) + 1;
        }
            
        System.out.println("Even number : " + even);
    }
}