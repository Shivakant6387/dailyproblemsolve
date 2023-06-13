package org.example.Demo;

public class Fibonacci {
    public static void main(String[] args) {
        printFibonacci(10);
        int n=10;
        for (int i=0;i<n;i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
    public static void printFibonacci(int n){
        int a=0;
        int b=1;
        int c=1;
        for (int i=1;i<=n;i++){
            System.out.print(a+" ");
            a=b;
            b=c;
            c=a+b;
        }

    }
    public static int fibonacci(int count){
        if(count<=1)
            return count;
        return fibonacci(count-1)+fibonacci(count-2);
    }
}
