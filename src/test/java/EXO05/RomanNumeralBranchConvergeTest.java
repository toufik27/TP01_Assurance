package EXO05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RomanNumeralBranchConvergeTest {
    @Test
    public void testWithNumberOutInterval() {
        int n = 0;
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(n));
    }

    @Test
    public void testWithAceptableNumber() {
        assertEquals("MMMCMXCIX", RomanNumeral.toRoman(3999));
    }
}
