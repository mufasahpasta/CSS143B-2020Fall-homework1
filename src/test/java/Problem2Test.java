import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test {

    // Example test
    // Okay to change
    @Test
    public void testBubbleSort() {
        int inputs[][] = {
                {},
                {3},
                {3, 1},
                {8, 5, 12, 2},
                {21, 12, 1, 16, 20},
        };

        int expected[][] = {
                {},
                {3},
                {1, 3},
                {2, 5, 8, 12},
                {1, 12, 16, 20, 21},
        };

        assertEquals(inputs.length, expected.length);
        for (int i = 0; i < inputs.length; i++) {
            Problem2.bubbleSort(inputs[i]);
            assertArrayEquals(inputs[i], expected[i]);
        }
    }
}
