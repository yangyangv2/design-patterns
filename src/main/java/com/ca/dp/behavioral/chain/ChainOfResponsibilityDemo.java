package com.ca.dp.behavioral.chain;

/**
 * Pitfalls
 * - Handling/Handler guarantee
 * - Runtime configuration risk
 * - Chain length/performance issue
 *
 * Summary
 * - Decouples sender and receiver
 * - Runtime configuration
 * - Hierarchical in nature
 * - Careful with large chains
 *
 * Created by yanya04 on 6/12/2017.
 */
public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Director bryan = new Director();
        VP crystal = new VP();
        CEO jeff = new CEO();
        bryan.setSuccessor(crystal);
        crystal.setSuccessor(jeff);

        Request request = new Request(RequestType.CONFERENCE, 500);
        bryan.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 1000);
        bryan.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 2500);
        bryan.handleRequest(request);
    }
}
