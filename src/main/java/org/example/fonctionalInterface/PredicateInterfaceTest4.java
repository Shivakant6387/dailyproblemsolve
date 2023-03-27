package org.example.fonctionalInterface;

import java.util.function.Predicate;

public class PredicateInterfaceTest4 {
    public static Predicate<String>hasLengthOf10=new Predicate<String>() {
        @Override
        public boolean test(String s) {
            return s.length()>10;
        }
    };
    public static void predicate_or(){
        Predicate<String>containsLetterA=p->p.contains("A");
        String containA="And";
        boolean outcome=hasLengthOf10.or(containsLetterA).test(containA);
        System.out.println(outcome);
    }
    public static void main(String[] args) {
        predicate_or();
    }
}
