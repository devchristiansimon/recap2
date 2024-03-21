package org.example;

public class Main {
    public static void main(String[] args) {
        Product banana = new Product("banana", "fruit", 0.39 );
        Product apple = new Product("apple", "fruit", 0.69 );
        Product hdtelevision = new Product("HDTV Ultra Galaxy", "Electronics", 1110.39 );

        ProductRepo inventar = new ProductRepo();
        OrderListRepo cart = new OrderListRepo();

        Order newOrder = new Order("banana", 4, 2.99);

        inventar.addProduct(banana);
       inventar.addProduct(banana);
        inventar.addProduct(apple);
        inventar.addProduct(apple);
        //cart.addOrder(newOrder);
        System.out.println(inventar);
        ShopService cashier = new ShopService(inventar.getProducts(), cart);
        cashier.setNewOrder(newOrder);
        System.out.println("----------------------------------------------------");


    }
}