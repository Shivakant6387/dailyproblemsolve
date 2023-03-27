package org.example.fonctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterfaceTest {
    public static void main(String[] args) {
        List<String>names= Arrays.asList("Geek","Geeks","GeekQuiz","Geek2");
        Predicate<String>predicate=s -> s.startsWith("G");
        for (String str:names){
            if (predicate.test(str))
                System.out.println(str);
        }
    }
}
