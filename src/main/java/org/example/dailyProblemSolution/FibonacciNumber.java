package org.example.dailyProblemSolution;

public class FibonacciNumber {
    public static int printFibonacci(int num){
        if (num<=1)
            return num;
        return printFibonacci(num-1)+printFibonacci(num-2);
    }
    public static void fibonacciNumber(int num){
        int a=0,b=0,c=1;
        for (int i=0;i<num;i++){
            a=b;
            b=c;
            c=a+b;
            System.out.print(a+",");

        }
    }
    public static void main(String[] args) {
        int num = 10;
        FibonacciNumber.fibonacciNumber(num);
        for (int i = 0; i < num; i++) {
            System.out.print("\n"+printFibonacci(i)+" ");
        }
    }
}
