public class RandomDice {
    public static void main(String[] args) {
        int dice = (int)(Math.random() * 6) + 1;
        System.out.println("Dice roll : " + dice);
    }
}
