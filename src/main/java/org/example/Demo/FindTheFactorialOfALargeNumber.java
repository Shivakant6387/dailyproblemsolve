package org.example.Demo;

import java.math.BigInteger;

public class FindTheFactorialOfALargeNumber {
    static BigInteger factorial(int n){
        BigInteger bigInteger=new BigInteger("1");
        for (int i=2;i<=n;i++){
            bigInteger=bigInteger.multiply(BigInteger.valueOf(i));
        }
        return bigInteger;
    }
    public static void main(String[] args) {
        int n=20;
        System.out.println(factorial(n));
    }
}
