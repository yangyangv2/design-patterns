package com.ca.dp.structural.decorator;

/**
 * Pitfalls
 *
 * - new class for every feature added
 * - multiple little objects
 * - often confused with simple inheritance
 *
 * Summary
 *
 * - original object can stay the same
 * - unique way to add functionality
 * - confused with inheritance
 * - can be more complex for clients
 *
 * Created by yanya04 on 6/8/2017.
 */
public class DecoratorSandwitchDemo {
    public static void main(String[] args) {
        Sandwich sandwith = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
        System.out.println(sandwith.make());
    }
}
