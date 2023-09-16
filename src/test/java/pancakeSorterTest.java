import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class pancakeSorterTest {

    PancakeSorter pancakeSorter;

    @BeforeEach
    public void setUp() {
        pancakeSorter = new PancakeSorter();
    }

    @Test
    public void testEmptyList() {
        PancakeSorter sorter = new PancakeSorter();
        assertTrue(sorter.sort(Arrays.asList()).isEmpty());
    }

    @Test
    public void testSingleElement() {
        PancakeSorter sorter = new PancakeSorter();
        assertEquals(Arrays.asList(1), sorter.sort(Arrays.asList(1)));
    }

    @Test
    public void testSortedList() {
        PancakeSorter sorter = new PancakeSorter();
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), sorter.sort(Arrays.asList(1, 2, 3, 4, 5)));
    }

    @Test
    public void testUnsortedList() {
        PancakeSorter sorter = new PancakeSorter();
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), sorter.sort(Arrays.asList(3, 4, 2, 1, 5)));
    }

    @Test
    public void testReverseOrderList() {
        PancakeSorter sorter = new PancakeSorter();
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), sorter.sort(Arrays.asList(5, 4, 3, 2, 1)));
    }
}
