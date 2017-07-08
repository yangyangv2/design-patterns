package com.ca.dp.creational.factory;

/**
 * Created by yanya04 on 5/10/2017.
 */
public class WebsiteFactory {

    public static Website getWebsite(WebsiteType type){
        switch(type) {
            case BLOG:
                return new Blog();

            case SHOP:
                return new Shop();

            default:
                return null;
        }
    }
}
