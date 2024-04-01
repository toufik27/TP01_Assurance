package EXO06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FizzBuzzBranchConvergeTest {

    @Test
    public void testNegative() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(-1));
    }


    @Test
    public void testMultiple3() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }

    @Test
    public void testMultiple5() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }

    @Test
    public void testMultiple3andMultiple5() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }

    @Test
    public void testNotAnyMultiple() {
        assertEquals("14", FizzBuzz.fizzBuzz(14));
    }
}
