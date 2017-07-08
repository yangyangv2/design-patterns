package com.ca.dp.structural.flyweight;

/**
 * Created by yanya04 on 6/9/2017.
 */
public class Order {
    private final int orderNumber;
    private final Item item;

    public Order(int orderNumber, Item item) {
        this.orderNumber = orderNumber;
        this.item = item;
    }

    void processOrder(){
        System.out.println("Ordering " + item + " for order number " + orderNumber);
    }
}
