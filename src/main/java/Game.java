import java.util.ArrayList;

public class Game {

    private Deck deck;
    private Dealer dealer;
    private ArrayList<Player> players;

    public Game() {
        deck = new Deck();
        dealer = new Dealer("Dealer");
        players = new ArrayList<Player>();
    }

    public Deck getDeck() {
        return deck;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public int numberOfPlayers() {
       return getPlayers().size();
    }


    public void addPlayer(Player player) {
        players.add(player);
    }


    public void start() {
        deck.shuffleCards();
        for (int i = 0; i < 2; i++) {
            Card dealerCard = deck.dealCard();
            dealer.receiveCard(dealerCard);
        }

        for(Player player : players) {
            for (int i = 0; i < 2; i++) {
                Card playerCard = deck.dealCard();
                player.receiveCard(playerCard);
            }
        }
    }

    public String showDealersFirstCard() {
        String dealerCardName = this.dealer.showCard(0);
        return String.format("Dealer's First Card is: %s", dealerCardName);
    }


//    public boolean checkForBlackjack() {
//
//    }
//
////    public boolean checkForBlackjack() {
////
////    }
}
