import org.calculator.services.CalculatorOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleCalculatorTest {

    @Test
    void twoPlusTwoEqualFour() {
        var calculatorOperations = new CalculatorOperations();
        Assertions.assertEquals(4, calculatorOperations.add(2, 2));
    }

    @Test
    void tenMinusTwoEqualEight() {
        var calculatorOperations = new CalculatorOperations();
        Assertions.assertEquals(8, calculatorOperations.sub(10, 2));
    }

    @Test
    void eightMultiplyFourEqualThirtyTwo() {
        var calculatorOperations = new CalculatorOperations();
        Assertions.assertEquals(32, calculatorOperations.mul(8, 4));
    }

    @Test
    void thirtyTwoDivideTwoEqualSixteen() {
        var calculatorOperations = new CalculatorOperations();
        Assertions.assertEquals(16, calculatorOperations.div(32, 2));
    }


}
