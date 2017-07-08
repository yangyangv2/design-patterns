package com.ca.dp.structural.bridge;

/**
 * Pitfalls
 * - increase complexity
 * - conceptually difficult to plan
 * - more than just OO
 * - what goes where
 *
 * Summary
 * - Design for uncertainty
 * - can be complex
 * - provides flexibility
 * - more than composition
 *
 *
 * Created by yanya04 on 5/10/2017.
 */
public class Shape2BridgeDemo {
    public static void main(String[] args) {
        Color blue = new Blue();

        Shape square = new Square(blue);

        Color red = new Red();

        Shape circle = new Circle(red);

        square.applyColor();
        circle.applyColor();
    }
}
