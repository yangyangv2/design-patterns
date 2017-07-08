package com.ca.dp.behavioral.iterator;

import java.util.Iterator;

/**
 * Pitfall
 * - access to index
 * - directional
 * - speed / efficiency
 *
 * Summary
 * - Efficient way to traverse
 * - Hides algorithms
 * - Simplify client
 * - Foreach
 *
 * Created by yanya04 on 6/13/2017.
 */
public class IteratorDemo {
    public static void main(String[] args) {
        BikeRepository repo = new BikeRepository();
        repo.addBike("a");
        repo.addBike("b");
        repo.addBike("c");
        Iterator<String> bikeIterator = repo.iterator();
        while(bikeIterator.hasNext()){
            System.out.println(bikeIterator.next());
        }
        for(String bike: repo){
            System.out.println(bike);
        }
    }
}
