package problem4;

import java.math.BigDecimal;

public class TestAuction {
    public static void main(String[] args) {

        Product prod1 = new Product("iPhone 12", new BigDecimal(999));
        Bidder sanchez = new Bidder("Sanchez");
        Bidder wei = new Bidder("Wei");
        Bidder scherger = new Bidder("Scherger");

        sanchez.subscribe(prod1);
        wei.subscribe(prod1);
        scherger.subscribe(prod1);

    }
}
