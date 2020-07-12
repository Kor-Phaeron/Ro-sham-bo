import java.util.Random;

class ComputerOpponent {
    static Random rand = new Random();

    public static int compChoice() {
        int n = rand.nextInt(3);
        return ++n;
    }
}