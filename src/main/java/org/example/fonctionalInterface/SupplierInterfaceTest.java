package org.example.fonctionalInterface;

import java.util.Map;
import java.util.function.Supplier;

public class SupplierInterfaceTest {
    public static void main(String[] args) {
        Supplier<Double>randomValue=()-> Math.random();
        System.out.println(randomValue.get());
    }
}
