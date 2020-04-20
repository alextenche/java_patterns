import controller.ScoreBoard;
import model.Balloon;
import model.Clown;
import model.SquareBalloon;

public class Main {

    public static void main(String[] args) {

        ScoreBoard scoreBoard = new ScoreBoard();

        System.out.print("balloon tap score: ");
        scoreBoard.algorithmBase = new Balloon();
        scoreBoard.showScore(10, 5);

        System.out.print("clown tap score: ");
        scoreBoard.algorithmBase = new Clown();
        scoreBoard.showScore(10, 5);

        System.out.print("square balloon tap score: ");
        scoreBoard.algorithmBase = new SquareBalloon();
        scoreBoard.showScore(10, 5);
    }
}
