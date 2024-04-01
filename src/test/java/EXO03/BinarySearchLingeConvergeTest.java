package EXO03;
import EXO03.BinarySearch;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchLingeConvergeTest {
    @Test
    public void testBinarySearch_TargetElementInMiddle_ReturnsCorrectIndex() {
        int[] array = {1, 3, 5, 7, 9};
        int index = BinarySearch.binarySearch(array, 5);
        assertEquals(2, index);
    }

    @Test
    public void testBinarySearch_TargetElementAtBeginning_ReturnsCorrectIndex() {
        int[] array = {1, 3, 5, 7, 9};
        int index = BinarySearch.binarySearch(array, 1);
        assertEquals(0, index);
    }

    @Test
    public void testBinarySearch_TargetElementAtEnd_ReturnsCorrectIndex() {
        int[] array = {1, 3, 5, 7, 9};
        int index = BinarySearch.binarySearch(array, 9);
        assertEquals(4, index);
    }

    @Test
    public void testBinarySearch_TargetElementNotInArrayBeforeArray_ReturnsNegativeOne() {
        int[] array = {1, 3, 5, 7, 9};
        int index = BinarySearch.binarySearch(array, 0);
        assertEquals(-1, index);
    }

    @Test
    public void testBinarySearch_TargetElementNotInArrayAfterArray_ReturnsNegativeOne() {
        int[] array = {1, 3, 5, 7, 9};
        int index = BinarySearch.binarySearch(array, 10);
        assertEquals(-1, index);
    }

    @Test
    public void testBinarySearch_NullArray_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> {
            BinarySearch.binarySearch(null, 5);
        });
    }
}
