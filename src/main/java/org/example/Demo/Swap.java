package org.example.Demo;

public class Swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        printSwap(a,b);
    }
    public static void printSwap(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+""+b);
    }
}
