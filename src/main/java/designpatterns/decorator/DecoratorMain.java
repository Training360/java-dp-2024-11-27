package designpatterns.decorator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class DecoratorMain {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jack");

        List<String> unmodifiable = Collections.unmodifiableList(names);
//        List<String> unmodifiable = List.copyOf(names);
        System.out.println(unmodifiable.getClass().getName());
//        new DecoratorMain().addElement(unmodifiable);
//        System.out.println(unmodifiable);

        names.add("Joe");
        System.out.println(unmodifiable);

        List<String> synchronizedNames = Collections.synchronizedList(names);
//        CopyOnWriteArrayList

        List<String> typed = Collections.checkedList(names, String.class);

        List raw = names;
        raw.add(12);

        System.out.println(names);

        String i = names.get(3);
    }

    public void addElement(List<String> elements) {
        elements.add("Jane");
    }

    public void addStringElement(List elements) {

    }
}
