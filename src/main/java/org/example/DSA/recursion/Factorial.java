package org.example.DSA.recursion;

public class Factorial {
    static int factorial(int nums){
        if (nums==0||nums==1)
            return 1;
        else
            return nums*factorial(nums-1);
    }
    public static void main(String[] args) {
        int nums=5;
        System.out.println("factorial of"+nums+"is :"+factorial(nums));
    }
}
