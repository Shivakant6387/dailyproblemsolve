package org.example.problem;

public class SumNumber {
   static void oddSum(int num){
       int sum=0;
       for (int i=0;i<=num;i++){
           if (i/2!=0){
               i++;
           }
           sum+=i;
       }

       System.out.println(sum);
   }
   static void sum(int num){
       int sum=0;
       for (int i=0;i<=num;i++){
           sum+=i;
       }
       System.out.println(sum);
   }
    public static void main(String[] args) {
        int num=5;
        sum(num);
        oddSum(num);
    }
}
