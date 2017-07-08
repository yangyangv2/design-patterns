package com.ca.dp.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yanya04 on 5/10/2017.
 */
public class Registry {

    private Map<String, Item> items = new HashMap<>();

    public Registry(){
        loadItems();
    }

    public Item createItem(String type){
        Item item = null;
        try {
            item = (Item)(items.get(type).clone());
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return item;
    }


    private void loadItems(){

        Movie movie = new Movie();
        movie.setTitle("Basic Move");
        movie.setPrice(24.99);
        movie.setRuntime("2 hours");
        items.put("Movie", movie);

        Book book = new Book();
        book.setNumberOfPages(500);
        items.put("Book", book);
    }
}
