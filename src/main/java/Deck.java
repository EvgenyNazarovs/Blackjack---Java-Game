import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();
        this.populate();
    }

    public void populate() {
        for(Suit suit : Suit.values()) {
            for(Rank rank : Rank.values()) {
                Card card = new Card(suit, rank);
                this.cards.add(card);
            }
        }
    }

    public int numberOfCards() {
        return this.cards.size();
    }

    public ArrayList<Card> allCards() {
        return cards;
    }

    public Card dealCard() {
        return cards.remove(0);
    }

    public void shuffleCards() {
        Collections.shuffle(cards);
    }
}
