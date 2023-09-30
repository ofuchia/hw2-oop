package problem5;

import java.util.Arrays;
import java.util.List;


public class TestShoppingCart {
    public static void main(String[] args) {
        List<CartItem> list = Arrays.asList(
                new CartItem("iPhone 10", 1, 40),
                new CartItem("Vizio TV", 2, 500),
                new CartItem("Tesla", 1, 50)
        );
        ShoppingCart shoppingCart = new ShoppingCart(list);


        // write your code here for strategy 1: 10% off all products
        shoppingCart.checkout(shoppingCart, 1);
        // end of your code

        // write your code here for strategy 2
        shoppingCart.checkout(shoppingCart, 2);
        // end of your code

        // write your code here for strategy 3
        shoppingCart.checkout(shoppingCart, 3);
        // end of your code

    }
}
