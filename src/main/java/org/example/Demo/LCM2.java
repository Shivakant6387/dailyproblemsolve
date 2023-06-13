package org.example.Demo;
import java.util.*;
public class LCM2 {
    public static void main(String[] args) {
        List<Integer>num=Arrays.asList(12,15,9,10,6,3);
        int lcm=lcm(num);
        System.out.println("lcm of"+num+"is"+lcm);
    }
    public static int lcm(List<Integer>numbers){
        return numbers.stream().reduce(1,(x,y)->(x*y)/gcd(x,y));
    }
    static int gcd(int n,int m){
        if (m==0)
            return n;
        return gcd(m,n%m);
    }
}
