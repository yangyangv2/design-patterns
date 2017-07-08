package com.ca.dp.structural.flyweight;

/**
 * Pitfalls
 * - Complex pattern
 * - Premature optimization
 * - Must understand Factory pattern
 * - Not a graphical pattern
 *
 * Summary
 * - Great for Memory Management
 * - A little bit complex
 * - Used a lot by the core API
 *
 * Created by yanya04 on 6/9/2017.
 */
public class FlyweightInventoryDemo {

    public static void main(String[] args) {
        InventorySystem ims = new InventorySystem();

        ims.takeOrder("Roomba", 221);
        ims.takeOrder("Roomba", 11);
        ims.takeOrder("Roomba", 131);
        ims.takeOrder("Roomba", 4);

        ims.process();

        System.out.println(ims.report());
    }
}
