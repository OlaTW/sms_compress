import java.math.BigDecimal;

public class CostCalculator {

    private BigDecimal unitPrice;

    public CostCalculator(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    BigDecimal calculate(int howManyMessages){

    return unitPrice.multiply(new BigDecimal(howManyMessages));

    }


}
