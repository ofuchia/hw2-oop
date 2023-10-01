package problem5;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<CartItem> items = new ArrayList<>();

    public ShoppingCart(List<CartItem> items) {
        this.items = items;
    }

    public void checkout(ShoppingCart shoppingCart, int promoNumber) {

        if(promoNumber == 1){
            double totalPrice= 0.0;
            double saved= 0.0;
            //finding total before promo
            for(CartItem item : shoppingCart.items){
                totalPrice += item.getPrice() * item.getNumber();
            }
            //calculating the money saved
            saved = (totalPrice* 0.10);

            //updating the final price of cart
            totalPrice = totalPrice-saved;
            System.out.println("$"+ totalPrice);
        }
        else if (promoNumber == 2){
            double totalPrice= 0.0;
            //calculating total before promo
            for(CartItem item : shoppingCart.items){
                totalPrice += item.getPrice() * item.getNumber();
            }
            //refunding $100
            if(totalPrice >= 500.0){
                totalPrice -= 100;
                System.out.println("$" + totalPrice);
            }
        }
        //promo number 3
        else if (promoNumber == 3){
            double totalPrice= 0.0;
            //calculating total before promo
            for(CartItem item : shoppingCart.items){
                totalPrice += item.getPrice() * item.getNumber();
            }
            System.out.println("Add a free Amazon Echo Dot in shopping cart");
            System.out.println("$"+ totalPrice);
        }
        else{
            return;
        }
    }
}
