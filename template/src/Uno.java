import java.util.Random;

public class Uno extends Game {
    private int currentPlayer;
    private int remainingTurns;

    void initializeGame() {
        System.out.println("Share seven uno cards for all the players.");
        currentPlayer = new Random().nextInt(playersCount);
        System.out.println("Starting player is " + (currentPlayer +1) + ".");
        remainingTurns = new Random().nextInt(48) + 15;
    }


    void makePlay(int player) {
        currentPlayer = new Random().nextInt(playersCount);
        System.out.println("Player " + (currentPlayer + 1) + "'s turn.");
    }

    boolean endOfGame() {
        if (remainingTurns <= 0) {
            return true;
        } else {
            remainingTurns--;
            return false;
        }
    }


    void printWinner() {
        System.out.println("Game over. The winner is Player " + (currentPlayer + 1) + ".");
    }
}
