package org.example;

public class PartitionEqualSubsetSum {
    public static boolean findPartion(int arr[],int n){
        int sum=0;
        int i,j;
        for (i=0;i<n;i++)
            sum+=arr[i];
        if (sum%2!=0)
            return false;
            boolean []part=new boolean[sum/2+1];
            for (i=0;i<=sum/2;i++){
                part[i]=false;
            }
            for (i=0;i<n;i++){
                for (j=sum/2;j>=arr[i];j--){
                    if (part[j-arr[i]]==true || j==arr[i])
                        part[j]=true;
                }
            }
            return part[sum/2];
    }
    public static void main(String[] args)
    {
        int arr[] = { 1, 3, 3, 2, 3, 2 };
        int n = 6;
        // Function call
        if (findPartion(arr, n) == true)
            System.out.println("Can be divided into two " + "subsets of equal sum");
        else
            System.out.println("Can not be divided into " + "two subsets of equal sum");
    }
}
