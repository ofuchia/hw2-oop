package problem4;

import java.math.BigDecimal;

public class Bidder {
    String bidderName;

    public Bidder(String bidderName) {
        this.bidderName = bidderName;
    }

    public String getBidderName() {
        return bidderName;
    }

    @Override
    public String toString() {
        return bidderName;
    }


    //bidder notified when a higher price is put down.
    //bidder subscribes to an object
    public void subscribe(Product product) {
        product.subscribers.add(this);
    }
    public void placeBid(Product product, BigDecimal biddingPrice){
        product.setBidPrice(biddingPrice);
        //notifty all subscribers
    }
    public boolean equals(Bidder secondBidder){
        return this.bidderName.equals(secondBidder.bidderName);
    }
}
