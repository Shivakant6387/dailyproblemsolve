package org.example.fonctionalInterface;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateInterfaceTest5 {
    public static Predicate<String>hasLengthOf10=new Predicate<String>() {
        @Override
        public boolean test(String s) {
            return s.length()>10;
        }
    };
    public static void predicate_and(){
        Predicate<String>nonNullPredicate= Objects::nonNull;
        String nullString=null;
        boolean outcome=nonNullPredicate.and(hasLengthOf10).test(nullString);
        System.out.println(outcome);
    }
    public static void main(String[] args) {

    }
}
