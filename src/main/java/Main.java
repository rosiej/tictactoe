import java.util.Scanner;

public class Main {
    public static void main(String[]  args) {
        Game game = new Game();

        Scanner scanner = new Scanner(System.in);

        System.out.println(game.getBoard());

        while (!game.isEnded()) {
            System.out.println(String.format("%s's turn:", game.getActualPlayerSymbol()));

            int x = scanner.nextInt();
            int y = scanner.nextInt();

            game.nextMove(x, y);

            System.out.println(game.getBoard());
        }
    }
}
