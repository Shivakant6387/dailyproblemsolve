package org.example.pattern;

public class Pattern47 {
    public static void main(String[] args) {
        int alphabet=65;
        System.out.println("** Printing the pattern... **");
        for (int i=0;i<=5;i++){
            for (int j=5;j>=i;j--){
                System.out.print((char) (alphabet+j)+" ");
            }
            System.out.println();
        }
    }
}
