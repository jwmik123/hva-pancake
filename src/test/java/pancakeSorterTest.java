import org.example.PancakeSorter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class PancakeSorterTest {

    PancakeSorter pancakeSorter;

    @BeforeEach
    public void setUp() {
        pancakeSorter = new PancakeSorter();
    }

    @Test
    public void testEmptyList() {
        assertTrue(pancakeSorter.sort(List.of()).isEmpty());
    }

    @Test
    public void testSingleElement() {
        assertEquals(List.of(1), pancakeSorter.sort(List.of(1)));
    }

    @Test
    public void testSortedList() {
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), pancakeSorter.sort(Arrays.asList(1, 2, 3, 4, 5)));
    }

    @Test
    public void testUnsortedList() {
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), pancakeSorter.sort(Arrays.asList(3, 4, 2, 1, 5)));
    }

    @Test
    public void testReverseOrderList() {
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), pancakeSorter.sort(Arrays.asList(5, 4, 3, 2, 1)));
    }
}
