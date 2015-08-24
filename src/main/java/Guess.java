public class Guess
{

    public static String judge(int numberOne, int numberTwo)
    {
        int countOfA = 0;
        int countOfB = 0;

        String one = Integer.toString(numberOne);
        String two = Integer.toString(numberTwo);

        for (int i = 0; i < one.toCharArray().length; i++) {
            char singleNumber = one.charAt(i);
            if (singleNumber == two.charAt(i)) {
                countOfA++;
            }
            if (two.indexOf(singleNumber) != -1) {
                countOfB++;
            }
        }

        return String.format("%dA%dB", countOfA, countOfB - countOfA);
    }
}
