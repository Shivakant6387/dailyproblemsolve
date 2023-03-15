package org.example.testdaily;

public class CountTheNumberOfTimesAGivenDigitOccurs {
    static int countoccurrences(int n, int d)
    {
        int count=0;
        while (n>0){
            count=(n%10==d)?count+1:count;
            n=n/10;
        }
        return count;
    }
    public static void main(String[] args) {
        int d = 2;
        int n = 214215421;

        System.out.println(countoccurrences(n, d));
    }
}
