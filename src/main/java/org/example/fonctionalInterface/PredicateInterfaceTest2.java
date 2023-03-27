package org.example.fonctionalInterface;

import java.util.function.Predicate;

public class PredicateInterfaceTest2 {
    public static void main(String[] args) {
        Predicate<Integer>greaterThan=i->i>10;
        Predicate<Integer>LowerThenTwenty=i->i<20;
        boolean result=greaterThan.and(LowerThenTwenty).test(15);
        System.out.println(result);
        boolean result2=greaterThan.and(LowerThenTwenty).negate().test(15);
        System.out.println(result2);
    }
}
