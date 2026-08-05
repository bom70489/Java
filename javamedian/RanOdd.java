public class RanOdd {
    public static void main(String[] args) {
        int ranodd = (int) (Math.random() * 99) + 1;

        while (ranodd % 2 == 0) {
            ranodd = (int) (Math.random() * 99) + 1;
        }

        System.out.println("Random odd number : " + ranodd);

    }
}