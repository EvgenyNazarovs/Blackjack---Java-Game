import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    private Card card;

    @Before
    public void before() {
        card = new Card(Suit.HEARTS, Rank.KING);
    }

    @Test
    public void hasSuit() {
        assertEquals(Suit.HEARTS, card.getSuit());
    }

    @Test
    public void hasRank() {

        assertEquals(Rank.KING, card.getRank());
    }

    @Test
    public void cardName() {
        assertEquals("KING of HEARTS", card.getCardName());
    }




}
