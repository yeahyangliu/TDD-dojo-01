import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class NumberFactoryTest
{

    @Test
    public void shouldGenerateFourNumber()
    {
        assertThat(Integer.toString(new NumberFactory().getRandomNumber()).length(), is(4));
    }
}
