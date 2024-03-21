package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OrderListRepo {

    private List<Order> orderList;
    public OrderListRepo() {
        this.orderList = new ArrayList<>();
    }

    public void addOrder(Order order){
        orderList.add(order);
    }
    public void removeOrder(Order order){
        orderList.remove(order);
    }

    public List<Order> getOrderList() {
        return orderList;
    }
    public Order getUniqueOrder(int productIndex){
        return orderList.get(productIndex);
    }
//-----------------------------------------------------------------------------
    @Override
    public String toString() {
        return "OrderListRepo{" +
                "orderList=" + orderList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderListRepo that = (OrderListRepo) o;
        return Objects.equals(orderList, that.orderList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderList);
    }


}
