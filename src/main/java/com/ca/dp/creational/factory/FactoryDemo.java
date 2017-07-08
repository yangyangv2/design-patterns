package com.ca.dp.creational.factory;

/**
 * Pitfalls:
 * - Complexity
 * - Creation in subclass
 * - Refactoring
 *
 * Summary:
 * - Parameter Driven
 * - Solves complex creation
 * - A little complex
 * - Opposite of a singleton
 *
 * Created by yanya04 on 5/10/2017.
 */
public class FactoryDemo {
    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);

        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);

        System.out.println(site.getPages());
    }
}
