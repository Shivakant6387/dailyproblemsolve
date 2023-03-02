package org.example;

public class MissingNumberInArray {
    public static void main(String[] args)   {
        int arr[] = { 1, 3, 7, 5, 6, 2 };
        int n = arr.length;
        findMissing(arr, n);
    }
    public static void findMissing(int arr[], int N)
    {
        int temp[]=new int[N+1];
        int i;
        for (i=0;i<=N;i++){
            temp[i]=0;
        }
        for (i=0;i<N;i++){
            temp[arr[i]-1]=1;
        }
        int ans=0;
        for (i=0;i<=N;i++){
            if (temp[i]==0)
                ans=i+1;
        }
        System.out.println(ans);
    }
}
