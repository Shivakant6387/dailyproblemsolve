package org.example.dailyProblemSolution;

public class RecursionFactorial {
    public static long factorial(long n){
        if (n==1)
            return 1;
        else
            return (n*factorial(n-1));
    }
    public static void main(String[] args) {
        long n=9;
        System.out.println(factorial(n));
    }
}
