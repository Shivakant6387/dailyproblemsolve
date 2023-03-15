package org.example.testdaily;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n=0,n2=1,n3,i,count=10;
        System.out.print(n+" "+n2);
        for (i=2;i<count;i++){
            n3=n+n2;
            System.out.print(" " + n3);
            n=n2;
            n2=n3;
        }
    }
}
