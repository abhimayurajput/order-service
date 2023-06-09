package www.neosoft.com.orderservice.utilities;


import www.neosoft.com.orderservice.model.Product;

import java.math.BigDecimal;

public class CartUtilities {

    public static BigDecimal getSubTotalForItem(Product product, int quantity){
        return (product.getPrice()).multiply(BigDecimal.valueOf(quantity));
    }
}
