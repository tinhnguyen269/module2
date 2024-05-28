import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {

    @Test
    @DisplayName("Testing wrong operator")
    void testCalculateWrongOperator() {
        int firstOperand = 2;
        int secondOperand = 0;
        char operator = '=';

        assertThrows(RuntimeException.class,
                ()-> {Calculator.calculate(firstOperand, secondOperand, operator);});
    }
}
