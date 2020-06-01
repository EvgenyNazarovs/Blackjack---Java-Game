import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player;
    private Card card;
    private Card card1;

    @Before
    public void setUp() {
        player = new Player("Ralph");

        card = new Card(Suit.HEARTS, Rank.KING);
        card1 = new Card(Suit.DIAMONDS, Rank.FOUR);
    }

    @Test
    public void hasName() {
        assertEquals("Ralph", player.getName());
    }

    @Test
    public void hasAnEmptyCardsArray() {
        assertEquals(0, player.numberOfCards());
    }

    @Test
    public void canReceiveCard() {
        player.receiveCard(card);
        assertEquals(1, player.numberOfCards());
    }

    @Test
    public void canGetHandTotal() {
        player.receiveCard(card);
        player.receiveCard(card1);
        assertEquals(14, player.handTotal());
    }

    @Test
    public void canShowCard() {
        player.receiveCard(card);
        player.receiveCard(card1);
        assertEquals("KING of HEARTS", player.showCard(0));
        assertEquals("FOUR of DIAMONDS", player.showCard(1));
    }



}
