package com.ca.dp.behavioral.chain;

/**
 * Created by yanya04 on 6/12/2017.
 */
public class Request {

    private RequestType requestType;
    private double amount;

    public Request(RequestType requestType, double amount) {
        this.requestType = requestType;
        this.amount = amount;
    }

    public RequestType getRequestType(){
        return requestType;
    }

    public double getAmount(){
        return amount;
    }
}
