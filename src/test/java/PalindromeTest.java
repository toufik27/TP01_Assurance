import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import EXO01.Palindrome;
public class PalindromeTest {

    @Test
    public void testIsPalindromeWithPalindromeString() {
        assertTrue(Palindrome.isPalindrome("kayak"));
    }

    @Test
    public void testIsPalindromeWithPalindromeStringIgnoringCase() {
        assertTrue(Palindrome.isPalindrome("Esope reste ici et se repose"));
    }

    @Test
    public void testIsPalindromeWithNonPalindromeString() {
        assertFalse(Palindrome.isPalindrome("hello"));
    }

    @Test
    public void testIsPalindromeWithNullString() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null));
    }

    @Test
    public void testIsPalindromeWithEmptyString() {
        assertTrue(Palindrome.isPalindrome(""));
    }

    // Ajoutez des tests supplémentaires pour couvrir d'autres cas de test
}
