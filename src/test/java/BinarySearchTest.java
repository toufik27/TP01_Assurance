import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import EXO03.BinarySearch;
public class BinarySearchTest {

    @Test
    public void testBinarySearchWithEmptyArray() {
        int[] array = {};
        int element = 5;
        assertEquals(-1, BinarySearch.binarySearch(array, element));
    }

    @Test
    public void testBinarySearchWithSingleElementArrayAndElementPresent() {
        int[] array = {3};
        int element = 3;
        assertEquals(0, BinarySearch.binarySearch(array, element));
    }

    @Test
    public void testBinarySearchWithSingleElementArrayAndElementNotPresent() {
        int[] array = {7};
        int element = 3;
        assertEquals(-1, BinarySearch.binarySearch(array, element));
    }

    @Test
    public void testBinarySearchWithMultipleOccurrencesOfElement() {
        int[] array = {2, 4, 6, 8, 8, 8, 10};
        int element = 8;
        assertEquals(3, BinarySearch.binarySearch(array, element));
    }

    @Test
    public void testBinarySearchWithElementPresentInArray() {
        int[] array = {1, 3, 5, 7, 9};
        int element = 5;
        assertEquals(2, BinarySearch.binarySearch(array, element));
    }

    @Test
    public void testBinarySearchWithElementNotPresentInArray() {
        int[] array = {2, 4, 6, 8, 10};
        int element = 5;
        assertEquals(-1, BinarySearch.binarySearch(array, element));
    }
}
