import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Deck deck;
    Dealer dealer;
    ArrayList<Player> players;
    Game game;
    Player player;
    Card card1;
    Card card2;
    Player player1;

    @Before
    public void setUp() {
        game = new Game();
        player = new Player("Daniel");
        card1 = new Card(Suit.DIAMONDS, Rank.KING);
        player1 = new Player("Robero");

    }

    @Test
    public void gameHasADeck() {
        assertEquals(52, game.getDeck().numberOfCards());
    }

    @Test public void gameHasDealer() {
        assertEquals("Dealer", game.getDealer().getName());
    }

    @Test public void playersArrayListStartsEmpty() {
        assertEquals(0, game.numberOfPlayers());
    }

    @Test public void canAddPlayer() {
        game.addPlayer(player);
        assertEquals(1, game.numberOfPlayers());
    }

    @Test
    public void canDealCards() {
        game.addPlayer(player);
        game.addPlayer(player1);
        game.start();
        assertEquals(2, game.getDealer().numberOfCards());
        assertEquals(2, player1.numberOfCards());
    }

//    @Test
//    public void canCheckForOver21() {
//        game.addPlayer(player);
//        game.start()
//    }

//    @Test
//    public void canCheckForBlackjack() {
//
//        assertEquals(true, game.checkForBlackjack());
//    }

//    @Test
//    public void canCheckDealersFirstCard() {
//        Card card = dealer.getCards().get(0);
//
//    }

}
