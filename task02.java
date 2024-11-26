public class NumberUtils {
    public static boolean numberInInterval(int number) {
        return number >= 20 && number <= 30;
    }
}
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class NumberUtilsTest {

    @ParameterizedTest
    @CsvSource({
        "30, true",
        "25, true",
        "20, true",
        "19, false",
        "31, false",
        "15, false"
    })
    void testNumberInInterval(int number, boolean expected) {
        if (expected) {
            assertTrue(NumberUtils.numberInInterval(number));
        } else {
            assertFalse(NumberUtils.numberInInterval(number));
        }
    }
}
