import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OddOneTest {
    private OddOneOut oddOneOut;

    @BeforeEach
    void setUp(){
        oddOneOut = new OddOneOut();
    }
    @Test
    void testLengthOfArray(){
        int[] arr = {4, 8, 6, 2, 9};
        boolean oddOne = oddOneOut.arrLength(arr);
        assertTrue(oddOne);
    }
    @Test
    void testOneOddOut(){
        int[] arr = {4, 8, 6, 2, 9};
        int oddOne = oddOneOut.oddOneOut(arr);
        assertEquals(9, oddOne);
    }
}
