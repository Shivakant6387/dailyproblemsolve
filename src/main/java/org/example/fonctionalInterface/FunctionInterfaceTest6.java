package org.example.fonctionalInterface;

import java.util.function.Function;

public class FunctionInterfaceTest6 {
    public static void main(String[] args) {
        Function<Integer,Integer> i=Function.identity();
        System.out.println(i.apply(10));
    }
}
