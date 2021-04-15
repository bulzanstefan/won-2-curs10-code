package ro.fasttrackit.curs10.javaObjects;

import ro.fasttrackit.curs10.homework.Programmer;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("tastatura");
        Product keys = new Product("keys");

        String stringRepresentation = product.toString();
        System.out.println(stringRepresentation);
        System.out.println(product);

        boolean equals = product.equals(keys);
        System.out.println(equals);

        Product tastatura = new Product("tastatura");
        System.out.println(tastatura.equals(product));

        int hash = product.hashCode();
        System.out.println(hash);

        // a==b -> a.hash == b.hash
        // a!=b -> a.hash poate fi == b.hash

        Object obj = new Programmer("Ana", "Are", LocalDate.now(), "Oradea", 1000, "Java");
        obj = stringRepresentation;
        obj = product;

        printObject(obj);
        printObject(new Product("test"));
        printObject("test");
        printObject(1);
        printObject(LocalDate.now());

        String[] name = {"a", "b"};
        System.out.println(name[0]);
        System.out.println(name[1]);

        String[] moreNames = new String[name.length + 3];
        for (int i = 0; i < name.length; i++) {
            moreNames[i] = name[i];
        }
        moreNames[2] = "c";
        System.out.println(Arrays.toString(moreNames));

    }

    private static void printObject(Object obj) {
        System.out.println("--------");
        System.out.println("This is my object " + obj);
        System.out.println("Class: " + obj.getClass());
        boolean isString = obj instanceof String;
        System.out.println("instance of String? " + isString);
    }
}
