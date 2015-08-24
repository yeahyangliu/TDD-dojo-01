import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class GuessTest
{

    @Test
    public void shouldShowBGivenPositonNotEqualButNumberTheSame()
    {
        assertThat(Guess.judge(4321, 1234), is("0A4B"));
    }

    @Test
    public void shouldShowAGivenPositionAndNumberTheSame()
    {
        assertThat(Guess.judge(1234, 1234), is("4A0B"));
        assertThat(Guess.judge(1234, 1256), is("2A0B"));
        assertThat(Guess.judge(1234, 1567), is("1A0B"));
    }

}
