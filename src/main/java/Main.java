import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Game game = new Game(new NumberFactory());

        for (int i = 1; i < 7; i++) {
            game.guess(Integer.valueOf(new Scanner(System.in).nextLine()));
        }
        if(game.isWin()) {
            System.out.println("Win");
        }else {
            System.out.println("Lost");
        }
    }
}
