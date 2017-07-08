package com.ca.dp.behavioral.strategy;

/**
 * Pitfalls
 * - Client aware of Strategies
 * - Increased number of classes
 *
 * Strategy Summary
 * - Externalized algorithms
 * - Client knows different Strategies
 * - Class per Strategy
 * - Reduce Conditional statements
 *
 *
 * Created by yanya04 on 6/19/2017.
 */
public class StrategyDemo {

    public static void main(String[] args) {

        CreditCard amexCard = new CreditCard(new AmexStrategy());

        amexCard.setNumber("379185883464283");
        amexCard.setDate("04/2020");
        amexCard.setCvv("123");

        System.out.println("Is Amex valid: " + amexCard.isValid());


        CreditCard amexCard2 = new CreditCard(new AmexStrategy());
        amexCard2.setNumber("379185883464282");
        amexCard2.setDate("04/2020");
        amexCard2.setCvv("123");

        System.out.println("Is Amex valid: " + amexCard2.isValid());


        CreditCard visaCard = new CreditCard(new VisaStrategy());
        visaCard.setNumber("4539589763663402");
        visaCard.setDate("05/2018");
        visaCard.setCvv("324");

        System.out.println("Is Visa valid: " + visaCard.isValid());
    }
}
