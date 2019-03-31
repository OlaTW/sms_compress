import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class CostCalculatorTest {


    @Test
    public void calculate() {
        int numberOfSMS = 5;
        BigDecimal smsCost = new BigDecimal(2);
        BigDecimal expectedCost = new BigDecimal(10);
        CostCalculator costCalculator = new CostCalculator(smsCost);

        assertEquals(expectedCost, costCalculator.calculate(numberOfSMS));
    }

    @Test
    public void calculate1SMS() {
        int numberOfSMS = 1;
        BigDecimal smsCost = new BigDecimal(0.35);
        BigDecimal expectedCost = new BigDecimal(0.35);
        CostCalculator costCalculator = new CostCalculator(smsCost);

        assertEquals(expectedCost, costCalculator.calculate(numberOfSMS));
    }
    @Test
    public void calculate0SMS() {
        int numberOfSMS = 0;
        BigDecimal smsCost = new BigDecimal(2);
        BigDecimal expectedCost = new BigDecimal(0);
        CostCalculator costCalculator = new CostCalculator(smsCost);

        assertEquals(expectedCost, costCalculator.calculate(numberOfSMS));
    }
}