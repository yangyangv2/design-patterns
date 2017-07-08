package com.ca.dp.behavioral.command;

/**
 * Created by yanya04 on 6/12/2017.
 */
// invoker
public class Switch {

    public void storeAndExecute(Command command){
        command.execute();
    }
}
