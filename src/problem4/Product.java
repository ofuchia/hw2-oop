package problem4;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Product {
    String productName;
    BigDecimal initialPrice;
    BigDecimal newBidPrice;

    public Product(String productName, BigDecimal initialPrice) {
        this.productName = productName;
        this.initialPrice = initialPrice;
    }

    public void setBidPrice(BigDecimal newBidPrice){
        this.newBidPrice = newBidPrice;
    }

    List<Bidder> subscribers = new ArrayList<>();
    //traverse list to notify all




    public void notifyBidders(Bidder bidder, BigDecimal amount){
        //bidder recieving message is the same one placing highest bid
        if(bidder.equals(this)){
            System.out.println("Hello" + bidder.bidderName+ "! New bid amount of "+ amount+" has been placed on"+productName+ "by you!");
        }
        else{
            System.out.println("Hello" + bidder.bidderName+ "! New bid amount of "+ amount+" has been placed on"+productName+ "by"+ bidder.getBidderName());
        }

    }
}
