package org.example.dailyProblemSolution;

public class PrimeNot {
    public static boolean prime(int nums){
        if (nums==0||nums==1){
            return false;
        }
        if (nums==2){
            return true;
        }
        for (int i=2;i<=nums/2;i++){
            if (nums%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int nums =7;
        System.out.println(prime(nums));
    }
}
