package org.example.fonctionalInterface;

import java.util.function.Function;

public class FunctionInterfaceTest3 {
    public static void main(String[] args) {
        Function<Integer,Double>half=a->a/2.0;
        try{
            half=half.andThen(null);
        }
        catch (Exception e){
            System.out.println("Exception thrown "
                    + "while passing null: "
                    + e);
        }
    }
}
