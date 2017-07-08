package com.ca.dp.creational.factory;

/**
 * Created by yanya04 on 5/10/2017.
 */
public class Blog extends Website {

    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
