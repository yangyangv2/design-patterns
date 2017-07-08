package com.ca.dp.behavioral.state;

/**
 * Pitfalls
 * - Know your states
 * - More classes
 * - Keep logic out of Context
 * - State change trigger
 *
 * Summary
 * - simplifies cyclomatic complexity
 * - Adding additional states made easier
 * - more classes
 * - similar implementation to Strategy
 *
 *
 * Created by yanya04 on 6/13/2017.
 */
public class StateDemo {
    public static void main(String[] args) {
        Fan fan = new Fan();
        System.out.println(fan);

        fan.pullChain();

        System.out.println(fan);

        fan.pullChain();

        System.out.println(fan);

        fan.pullChain();

        System.out.println(fan);

        fan.pullChain();

        System.out.println(fan);

    }
}
