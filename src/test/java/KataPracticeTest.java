import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataPracticeTest {

    @Test
    public void IntToStringtest() {
        assertEquals("67", KataPractice.numberToString(67));
        assertEquals("123", KataPractice.numberToString(123));
        assertEquals("999", KataPractice.numberToString(999));
    }

    @Test
    public void HighestAndLowestOfStringOfNums() {
        assertEquals("42 -9", KataPractice.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}
