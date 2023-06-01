import java.math.BigDecimal;

public class Program {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[] {
                new Bill(new BigDecimal(10000), new IncomeTaxType(), taxService),
                new Bill(new BigDecimal(10000), new VATaxType(), taxService),
                new Bill(new BigDecimal(10000), new ProgressiveTaxType(), taxService),
                new Bill(new BigDecimal(1000000), new ProgressiveTaxType(), taxService)
        };
        for (Bill bill : payments) {
            bill.payTaxes();
        }
    }
}
