package com.ca.dp.behavioral.chain;

/**
 * Created by yanya04 on 6/12/2017.
 */
public class Director extends Handler {
    @Override
    public void handleRequest(Request request){
        if(request.getRequestType() == RequestType.CONFERENCE){
            System.out.println("Directors can approve conferences");
        } else {
            successor.handleRequest(request);
        }
    }
}
