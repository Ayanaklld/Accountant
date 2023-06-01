import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount){
        return amount.compareTo(new BigDecimal(100000)) > 0
                ? (amount.multiply(new BigDecimal("0.15")))
                : (amount.multiply(new BigDecimal("0.10")));
    }
}
