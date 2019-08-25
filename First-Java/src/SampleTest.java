import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SampleTest extends junit.framework.TestCase{
	public void testAddingTwoPositiveIntegers() throws Exception {
        int expected = 11;
        int actual = new Sample().add(4, 7);
        assertEquals(expected, actual);
    }
  
    public void testAddingTwoNegativeIntegers() throws Exception {
        int expected = -11;
        int actual = new Sample().add(-4, -7);
        assertEquals(expected, actual);
    }
  
    public void testAddingNegativeIntegerToPositiveInteger() throws Exception {
        int expected = -3;
        int actual = new Sample().add(4, -7);
        assertEquals(expected, actual);
    }
}
