public class Game
{
    private NumberFactory factory;
    private int winNumber;
    private int times;

    public Game(NumberFactory factory)
    {
        this.factory = factory;
    }

    public String guess(int number)
    {
        if (times == 6) times = 0;
        times++;
        String judgeResult = Guess.judge(factory.getRandomNumber(), number);
        if ("4A0B".equals(judgeResult)) {
            winNumber++;
        }
        System.out.println(judgeResult);
        return judgeResult;
    }

    public boolean isWin()
    {
        return winNumber == 6;
    }
}
