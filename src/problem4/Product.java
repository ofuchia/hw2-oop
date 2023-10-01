package problem4;

import java.math.BigDecimal;

public class Product {
    private BigDecimal bidAmount;
    private String productName;
    private BigDecimal initalPrice;

    public Product(String productName, BigDecimal initalPrice) {
        this.productName = productName;
        this.initalPrice = initalPrice;
    }

    public BigDecimal getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(BigDecimal bidAmount) {
        this.bidAmount = bidAmount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getInitalPrice() {
        return initalPrice;
    }

    public void setInitalPrice(BigDecimal initalPrice) {
        this.initalPrice = initalPrice;
    }

    //should be same product name as above.
//    public void subscribeProduct(String productName, BigDecimal newBidPrice){
//        this.productName = productName.get
//    }
}
