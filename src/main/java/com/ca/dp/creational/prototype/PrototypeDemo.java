package com.ca.dp.creational.prototype;

/**
 * Created by yanya04 on 5/10/2017.
 *
 * Pitfalls of Prototype
 * - sometimes not clear when to use
 * - used with other patters
 *   - Registry
 * - Shallow VS Deep Copy
 *
 * Summary
 * - Guarantee unique instance
 * - Often refactored in
 * - Can help with performance issues
 * - Don't always jump to a Factory
 */
public class PrototypeDemo {
    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Creational Patterns in Java");

        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());

        Movie anotherMovie = (Movie) registry.createItem("Movie");
        anotherMovie.setTitle("Gang of Four");

        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getRuntime());
        System.out.println(anotherMovie.getTitle());
        System.out.println(anotherMovie.getUrl());

    }
}
