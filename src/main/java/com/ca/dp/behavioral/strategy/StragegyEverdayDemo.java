package com.ca.dp.behavioral.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by yanya04 on 6/19/2017.
 */
public class StragegyEverdayDemo {

    private static void printContents(List<Person> people){
        for (Person person: people){
            System.out.println(person.getName());
        }
    }
    public static void main(String[] args) {
        Person bryan = new Person("Bryan", "801-555-1212", 39);
        Person mark = new Person("Mark", "801-555-1213", 41);
        Person chris = new Person("Chris", "801-555-1214", 38);

        List<Person> people = new ArrayList<>();
        people.add(bryan);
        people.add(mark);
        people.add(chris);

        System.out.println("Not sorted");
        printContents(people);

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getAge() > o2.getAge()){
                    return 1;
                } else if (o1.getAge() < o2.getAge()){
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println("\nSorted by age");
        printContents(people);

    }
}
