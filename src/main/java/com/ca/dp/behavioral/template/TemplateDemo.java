package com.ca.dp.behavioral.template;

/**
 * Pitfalls
 * - Restrict access
 * - Confusing hierarchy
 * - Difficult Program flow
 *
 * Summary
 * - Guarantees Algorithm adherence
 * - IoC
 * - Easier Implementation
 *
 *
 * Created by yanya04 on 6/25/2017.
 */
public class TemplateDemo {

    public static void main(String[] args) {
        System.out.println("Web Order:");

        OrderTemplate webOrder = new WebOrder();

        OrderTemplate storeOrder = new StoreOrder();

        webOrder.processOrder();

        storeOrder.processOrder();
    }
}
