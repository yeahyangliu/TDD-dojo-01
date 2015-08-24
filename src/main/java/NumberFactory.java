import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberFactory
{
    public int getRandomNumber()
    {
        String numberStr = "";
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Collections.shuffle(integers);
        for (int i=0; i<4; i++) {
            numberStr += integers.get(i);
        }
        return Integer.parseInt(numberStr);
    }
}
