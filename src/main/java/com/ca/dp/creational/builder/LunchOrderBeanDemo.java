package com.ca.dp.creational.builder;
/**
 * The purpose of Builder pattern is to avoid telescope constructors
 *
 * Caution: builder pattern is
 *
 * - Immutable
 * - Inner static class
 * - Designed first
 * - Complexity
 *
 * Summary:
 * - deal with complexity
 * - easy to implement
 * - few drawbacks
 * - can refactor in with separate class
 *
 * Created by yanya04 on 5/10/2017.
 */
public class LunchOrderBeanDemo {
    public static void main(String args[]) {


        LunchOrder.Builder builder = new LunchOrder.Builder();

        builder.bread("Wheat").dressing("Mayo").meat("Turkey");

        LunchOrder lunchOrder = builder.build();

        System.out.println(lunchOrder.getBread());

    }
}
