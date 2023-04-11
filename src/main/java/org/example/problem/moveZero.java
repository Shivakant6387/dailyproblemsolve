package org.example.problem;

public class moveZero {
    public static void main(String[] args) {
        int arr[]={5,6,0,4,6,0,9,0,8};
        int n=arr.length;
        int j=0;
        for (int i=0;i<n;i++){
            if (arr[i]!=0){
                Swap(arr,j,i);
                j++;
            }
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public  static void Swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
