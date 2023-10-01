package problem4;

import java.math.BigDecimal;

public class Product {
    String productName;
    BigDecimal initialPrice;
    BigDecimal newBidPrice;

    public Product(String productName, BigDecimal initialPrice) {
        this.productName = productName;
        this.initialPrice = initialPrice;
    }
}
