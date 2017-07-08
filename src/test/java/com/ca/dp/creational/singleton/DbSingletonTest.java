package com.ca.dp.creational.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yanya04 on 5/9/2017.
 */
public class DbSingletonTest {

    @Test
    public void test(){
        DbSingleton singleton1 = DbSingleton.getInstance();
        DbSingleton singleton2 = DbSingleton.getInstance();
        assertEquals(singleton1, singleton2);
    }
}