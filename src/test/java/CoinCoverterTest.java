import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinCoverterTest {

    @Test
    @DisplayName("Converts 1 penny to '1 x 1p'")
    void convertAPenny() {
        CoinCoverter coinCoverter = new CoinCoverter();
        assertEquals("1 x 1p", coinCoverter.convertToCoins(123), "Converts 1 penny to '1 x 1p'");
    }

}
