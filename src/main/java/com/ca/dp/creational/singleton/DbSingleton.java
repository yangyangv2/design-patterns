package com.ca.dp.creational.singleton;
/**
 * Caution: Singleton pattern is
 * - often overused
 * - difficult to unit test
 * - if not careful, not thread-safe
 * - sometimes confused for Factory
 * - java.util.Calendar is NOT a singleton, it's a prototype
 *
 * Summary:
 * - guarantee one instance
 * - easy to implement
 * - solves a well defined problem
 * - don't abuse it
 *
 * Created by yanya04 on 5/8/2017.
 */
public class DbSingleton {

    // eagerly loaded
    //private static DbSingleton instance = new DbSingleton();

    private static DbSingleton instance = null;
    private DbSingleton() {}

    public static DbSingleton getInstance(){
        // lazily loaded
        if(instance == null){
            synchronized (DbSingleton.class){
                if(instance == null){
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }


}