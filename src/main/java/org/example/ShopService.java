package org.example;

import java.util.List;

public class ShopService {
    private Order newOrder;
    private List<Product> productList;
    private OrderListRepo orderListRepo;

    public ShopService(List<Product> productList, OrderListRepo orderListRepo) {
        this.productList = productList;
        this.orderListRepo = orderListRepo;
    }

    public void setNewOrder(Order newOrder) {
        for (Product product : productList) {
            if (newOrder.name().equals(product.name())) {
                this.newOrder = newOrder;
                System.out.println(newOrder.name() + " vorhanden und hinzugefügt");
                break;
            }
            else {
                System.out.println("Produkt nicht vorhanden");
            }
        }
    }
}