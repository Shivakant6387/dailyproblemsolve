package org.example.dailyProblemSolution;

public class FullPra {
    public static void main(String[] args) {
       int num=5;
       int sp=num-1;
       int st=1;
       for (int i=0;i<num;i++){
           for (int j=1;j<=sp;j++){
               System.out.print(" ");
           }
           for (int k=1;k<=st;k++){
               System.out.print("* ");
           }
           st++;
           sp--;
           System.out.println();
       }
    }
}
