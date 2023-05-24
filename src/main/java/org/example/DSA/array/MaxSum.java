package org.example.DSA.array;

public class MaxSum {
    static int findSingle(int arr[],int size){
        int res=arr[0];
        for (int i=1;i<size;i++)
            res=res^arr[i];
        return res;
    }
    public static void main(String[] args) {
        int ar[] = {2, 3, 5, 4, 5, 3, 4};
        int n = ar.length;
        System.out.println("Element occurring once is " + findSingle(ar, n) + " ");
    }
}
