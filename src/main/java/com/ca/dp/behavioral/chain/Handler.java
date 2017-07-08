package com.ca.dp.behavioral.chain;

/**
 * Created by yanya04 on 6/12/2017.
 */
public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor){
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);
}
