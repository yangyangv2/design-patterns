package com.ca.dp.behavioral.chain;

/**
 * Created by yanya04 on 6/12/2017.
 */
public class CEO extends Handler {
    @Override
    public void handleRequest(Request request) {
        System.out.println("CEOs can approve anything they want");
    }
}
