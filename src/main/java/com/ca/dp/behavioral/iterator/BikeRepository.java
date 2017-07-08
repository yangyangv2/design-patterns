package com.ca.dp.behavioral.iterator;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by yanya04 on 6/13/2017.
 */
public class BikeRepository implements Iterable<String> {
    private String[] bikes;
    private int index;

    public BikeRepository(){
        bikes = new String[10];
        index = 0;
    }

    public void addBike(String bike){
        if(index == bikes.length){
            String[] largerBikes = new String[bikes.length * 2];
            System.arraycopy(bikes, 0, largerBikes, 0, bikes.length);
            bikes = largerBikes;
            largerBikes = null;
        }
        bikes[index] = bike;
        index++;
    }

    @Override
    public Iterator<String> iterator() {
        Iterator<String> it = new Iterator<String>(){
            private int currentIndex;
            @Override
            public boolean hasNext() {
                return currentIndex < bikes.length && bikes[currentIndex] != null;
            }

            @Override
            public String next() {
                return bikes[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }

            @Override
            public void forEachRemaining(Consumer<? super String> action) {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }

    @Override
    public void forEach(Consumer<? super String> action) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Spliterator<String> spliterator() {
        throw new UnsupportedOperationException();
    }
}
