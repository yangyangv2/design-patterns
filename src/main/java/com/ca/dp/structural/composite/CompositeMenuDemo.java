package com.ca.dp.structural.composite;

/**
 * Pitfalls:
 * - overly simplify system
 * - difficult to restrict
 * - implementation can possibly be costly
 *
 * Composite Summary
 *
 * - Generalize a hierarchical structure
 * - can simply things too much
 * - easier for clients
 * - Composite != Composition
 *
 * Created by yanya04 on 6/8/2017.
 */
public class CompositeMenuDemo {
    public static void main(String[] args) {

        Menu mainMenu = new Menu("Main", "/main");

        MenuItem safetyMenuItem = new MenuItem("Safty", "/safety");

        mainMenu.add(safetyMenuItem);

        Menu claimSubMenu = new Menu("Claims", "claims");

        mainMenu.add(claimSubMenu);

        MenuItem personalClaimsMenu = new MenuItem("Personal Claim", "/claims/personalClaims");

        claimSubMenu.add(personalClaimsMenu);

        System.out.println(mainMenu.toString());

    }
}
