package com.ca.dp.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yanya04 on 6/9/2017.
 */
public class Catalog {
    private Map<String, Item> items = new HashMap<>();

    public Item lookup(String itemName){
        if(! items.containsKey(itemName)){
            items.put(itemName, new Item(itemName));
        }
        return items.get(itemName);
    }

    public int totoalItemsMade(){
        return items.size();
    }
}

