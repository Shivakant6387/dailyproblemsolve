package org.example.fonctionalInterface;

import java.util.function.Function;

public class FunctionInterfaceTest4 {
    public static void main(String[] args) {
        Function<Integer,Double>half=a->a/2.0;
        half=half.compose(a->3*a);
        System.out.println(half.apply(5));
    }
}
