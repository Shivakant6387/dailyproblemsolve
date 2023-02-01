package org.example;

public class RDA {
    public static void main(String[] args) {
int arr[]={10,20,20,30};
int n=arr.length;
n=rDA(arr,n);
for (int i=0;i<n;i++){
    System.out.println(arr[i]+"");
}
    }
    static int rDA(int arr[],int n){
        if (n==0||n==1){
            return n;
        }
        int []temp=new int[n];
        int j=0;
        for (int i=0;i<n-1;i++){
            if (arr[i]!=arr[i+1]){
                temp[j++]=arr[i];
            }
        }
        temp[j++]=arr[n-1];
        for (int i=0;i<j;i++){
            arr[i]=temp[i];
        }
        return j;
    }
}
