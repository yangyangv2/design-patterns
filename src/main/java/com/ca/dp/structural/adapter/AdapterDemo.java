package com.ca.dp.structural.adapter;

/**
 * Pitfalls
 * - not a lot
 * - don't complicate
 * - multiple adapters
 * - don't add functionality
 *
 * Summary
 * - simple solution
 * - easy to implement
 * - integrate with legacy code
 * - can provide multiple adapters
 *
 *
 *
 *
 *
 * Created by yanya04 on 5/10/2017.
 */
public class AdapterDemo {

    public static void main(String[] args) {
        EmployeeClient client = new EmployeeClient();


        System.out.println(client.getEmployeeList());


    }
}
