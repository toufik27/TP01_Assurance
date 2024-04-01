package Linge_converge;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import EXO02.Anagram;
public class AnagramTest {
    @Test
    public void testIsAnagramWithNullString() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "abc"));
    }
    @Test
    public void testIsAnagramWithDifferentSpacesAndCaseValideAnagrams() {
        assertTrue(Anagram.isAnagram("Listen", "S I L E N T"));
    }

    @Test
    public void testIsAnagramWithDifferentSpacesAndCaseWithDifferentLengths() {
        assertFalse(Anagram.isAnagram("Listensd", "S I L E N T"));
    }
    @Test
    public void testIsAnagramWithDifferentSpacesAndCaseWithNonAnagrams() {
        assertFalse(Anagram.isAnagram("hello", "World"));
    }
    @Test
    public void testIsAnagramWithEmptyStrings() {
        assertTrue(Anagram.isAnagram("", ""));
    }
}

