package org.example.dailyProblemSolution;

public class PrimeNumberTop50 {
    public static void main(String[] args) {
        int isPrime,n;
        System.out.println("All prime numbers between 50 prime");
        for (int i=1;i<=50;i++){
            isPrime=0;
            for (int j=2;j<=i/2;j++){
                if (i%j==0){
                    isPrime=1;
                    break;
                }
            }
            if (isPrime==0)
                System.out.println(i+" ");
        }
    }
}
