import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    Deck deck;
    Card card;
    Card testCard;

    @Before
    public void setUp() {
        deck = new Deck();
    }

    @Test
    public void deckStartsPopulated() {
        assertEquals(52, deck.numberOfCards());
    }

    @Test
    public void canGetCardFromDeck() {
        card = deck.dealCard();
        assertEquals(Suit.HEARTS, card.getSuit());
        assertEquals(Rank.ACE, card.getRank());
    }

}
