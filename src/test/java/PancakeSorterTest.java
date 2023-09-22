import org.pancakesorter.PancakeSorter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PancakeSorterTest {

    PancakeSorter pancakeSorter;

    // TODO: make sure this @beforeeach works.
    @BeforeEach
    void setUp() {
        pancakeSorter = new PancakeSorter();
    }

    @Test
    void testEmptyList() {
        PancakeSorter pancakeSorter = new PancakeSorter();
        assertArrayEquals(new int[]{}, pancakeSorter.sort(new int[]{}, 0));
    }

    @Test
    void testSingleElement() {
        PancakeSorter pancakeSorter = new PancakeSorter();
        assertArrayEquals(new int[]{1}, pancakeSorter.sort(new int[]{1}, 1));
    }

    @Test
    void testSortedList() {
        PancakeSorter pancakeSorter = new PancakeSorter();
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, pancakeSorter.sort(new int[]{1, 2, 3, 4, 5}, 5));
    }

    @Test
    void testUnsortedList() {
        PancakeSorter pancakeSorter = new PancakeSorter();
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, pancakeSorter.sort(new int[]{3, 4, 2, 1, 5}, 5));
    }

    @Test
    void testReverseOrderList() {
        PancakeSorter pancakeSorter = new PancakeSorter();
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, pancakeSorter.sort(new int[]{5, 4, 3, 2, 1}, 5));
    }
}
