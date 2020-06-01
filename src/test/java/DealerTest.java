import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    private Dealer dealer;

    @Before
    public void setUp() {
        dealer = new Dealer("Dealer");
    }

    @Test
    public void dealerIsCalledDealer() {
        assertEquals("Dealer", dealer.getName());
    }
}
