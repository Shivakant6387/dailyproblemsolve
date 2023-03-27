package org.example.fonctionalInterface;
@FunctionalInterface
interface Square{
    int calculate(int x);
}
public class FunctionalInterfaceAnnotation {
    public static void main(String[] args) {
        int a=5;
        Square s=x -> x*x;
        int ans=s.calculate(a);
        System.out.println(ans);
    }
}
