package com.ca.dp.structural.facade;

import com.ca.dp.creational.singleton.DbSingleton;

import javax.xml.ws.soap.Addressing;
import java.util.Collections;
import java.util.List;

/**
 * Pitfalls
 * - Typically used to clean up code
 * - Should think about API design
 * - Flat problem/structure
 * - The "Singleton" of Structural Pattern
 *
 * Summary
 * - Simplifies Client Interface
 * - Easy Pattern to implement
 * - Refactoring Pattern
 *
 * Created by yanya04 on 6/9/2017.
 */
public class JdbcFacadeDemo {

    DbSingleton instance = null;

    public JdbcFacadeDemo(){
        instance = DbSingleton.getInstance();
    }

    public int createTable() {
        // JDBC table create operation

        return 0;
    }

    public int insertIntoTable(){
        // JDBC table insert operation

        return 0;
    }
    public List<Addressing> getAddresses(){


        return Collections.emptyList();
    }
}
