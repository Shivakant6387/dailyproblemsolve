package org.example.fonctionalInterface;

import java.util.function.Function;

public class FunctionInterfaceTest2 {
    public static void main(String[] args) {
        Function<Integer,Double>half=a->a/2.0;
        half=half.andThen(aDouble -> 3*aDouble);
        System.out.println(half.apply(10));
    }
}
