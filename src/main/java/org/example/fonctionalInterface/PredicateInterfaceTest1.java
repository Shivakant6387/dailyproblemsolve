package org.example.fonctionalInterface;

import java.util.function.Predicate;

public class PredicateInterfaceTest1 {
    public static void main(String[] args) {
        Predicate<Integer>lesserthan=i->(i<18);
        System.out.println(lesserthan.test(10));
    }
}
