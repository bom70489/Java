public class RandomRGB {
    public static void main(String[] args) {
        int R = (int)(Math.random() * 255) + 0;
        int G = (int)(Math.random() * 255) + 0;
        int B = (int)(Math.random() * 255) + 0;

        System.out.printf("RGB(%d , %d , %d)" , R  , G , B);
    }
}