import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataPracticeTest {

    @Test
    public void IntToStringtest() {
        assertEquals("67", KataPractice.numberToString(67));
        assertEquals("123", KataPractice.numberToString(123));
        assertEquals("999", KataPractice.numberToString(999));
    }
}
