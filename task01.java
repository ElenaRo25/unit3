import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NumberCheckerTest {

    // Тест для четного числа
    @Test
    public void testEvenNumber() {
        assertTrue(NumberChecker.evenOddNumber(2));
        assertTrue(NumberChecker.evenOddNumber(0));
        assertTrue(NumberChecker.evenOddNumber(-4));
    }

    // Тест для нечетного числа
    @Test
    public void testOddNumber() {
        assertFalse(NumberChecker.evenOddNumber(1));
        assertFalse(NumberChecker.evenOddNumber(-3));
        assertFalse(NumberChecker.evenOddNumber(5));
    }
}