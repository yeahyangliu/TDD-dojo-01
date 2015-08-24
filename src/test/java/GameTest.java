import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GameTest
{

    private Game game;

    @Test
    public void shouldWinGameOnceWin6InARow()
    {
        NumberFactory factory = mock(NumberFactory.class);
        when(factory.getRandomNumber()).thenReturn(1234);

        game = new Game(factory);
        assertThat(game.guess(1234), is("4A0B"));
        assertThat(game.guess(1234), is("4A0B"));
        assertThat(game.guess(1234), is("4A0B"));
        assertThat(game.guess(1234), is("4A0B"));
        assertThat(game.guess(1234), is("4A0B"));
        assertThat(game.guess(1234), is("4A0B"));

        assertThat(game.isWin(), is(true));

    }
}
