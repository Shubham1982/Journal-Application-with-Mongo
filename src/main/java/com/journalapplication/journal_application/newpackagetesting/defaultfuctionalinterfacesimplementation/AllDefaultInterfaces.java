package com.journalapplication.journal_application.newpackagetesting.defaultfuctionalinterfacesimplementation;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class AllDefaultInterfaces {
    public static void main(String[] args) {

        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(5));
        System.out.println(isEven.test(6));

        Function<String,Integer> length = a -> a.length();

        System.out.println(length.apply("Shubham"));

        Consumer<String> consume = s -> System.out.println(s);
        consume.accept("java");

        Supplier<String> supplier = () -> "You are beautiful";
        System.out.println(supplier.get());
    }
}
