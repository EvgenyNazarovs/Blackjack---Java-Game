import java.util.ArrayList;
import java.util.Collection;

public class Player {

    private String name;
    private ArrayList<Card> cards;

    public Player(String name) {
        this.name = name;
        this.cards = new ArrayList<Card>();
    }

    public String getName() {
        return this.name;
    }


    public ArrayList<Card> getCards() {
        return cards;
    }

    public int numberOfCards() {
        return this.getCards().size();
    }

    public void receiveCard(Card card) {
        cards.add(card);
    }

    public int handTotal() {
        int total = 0;
        for (Card card : cards) {
            total += card.getRank().getValue();
        }
        return total;
    }

//    public Card getCard(int index) {
//        return cards.get
//    }

    public String showCard(int index) {
        return cards.get(index).getCardName();
    }

    public boolean checkForBlackjack() {
        boolean blackjack = false;

        for (Card card : cards) {
            if (card.getRank() == Rank.ACE) {
                blackjack = true;
            }
        }
        return blackjack;
    }

//    public boolean checkFor21() {
//        if (handTotal() == 21) {
//
//    }


}
