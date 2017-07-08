package com.ca.dp.creational.abfactory;

/**
 * Pitfalls
 * - complexity
 * - runtime switch
 * - Pattern with a pattern
 * - Problem specific
 * - start as a factory
 *
 * Summary
 * - Group of similar factories
 * - complex
 * - heavy abstraction
 * - framework pattern
 *
 * Created by yanya04 on 5/10/2017.
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {
        CreditCardFactory abstractFaotry = CreditCardFactory.getCreditCardFactory(755);
        CreditCard card = abstractFaotry.getCreditCard(CardType.PLATIUNM);
    }


}
