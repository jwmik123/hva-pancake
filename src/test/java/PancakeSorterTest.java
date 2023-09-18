import org.pancakeSorter.PancakeSorter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PancakeSorterTest {

    PancakeSorter pancakeSorter;

    @BeforeEach
    public void setUp() {
        pancakeSorter = new PancakeSorter();
    }

    @Test
    public void testEmptyList() {
        assertArrayEquals(new int[]{}, pancakeSorter.sort(new int[]{}, 0));
    }

    @Test
    public void testSingleElement() {
        assertArrayEquals(new int[]{1}, pancakeSorter.sort(new int[]{1}, 1));
    }

    @Test
    public void testSortedList() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, pancakeSorter.sort(new int[]{1, 2, 3, 4, 5}, 5));
    }

    @Test
    public void testUnsortedList() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, pancakeSorter.sort(new int[]{3, 4, 2, 1, 5}, 5));
    }

    @Test
    public void testReverseOrderList() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, pancakeSorter.sort(new int[]{5, 4, 3, 2, 1}, 5));
    }
}
