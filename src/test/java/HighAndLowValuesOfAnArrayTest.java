import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HighAndLowValuesOfAnArrayTest {

    @Test
    public void HighestAndLowestOfStringOfNums() {
        assertEquals("42 -9", HighAndLowValuesOfAnArray.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}
