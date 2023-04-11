package org.example.problem;

public class LeftRotateArray {
    void leftRotate(int arr[],int d,int n){
        int temp []=new int[d];
        for (int i=0;i<d;i++)
            temp[i]=arr[i];
        for (int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        for (int i=0;i<d;i++){
            arr[i+n-d]=temp[i];
        }
    }
    void printArray(int arr[],int n){
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        LeftRotateArray rotateArray=new LeftRotateArray();
        int arr[]={1,2,3,4,5};
        rotateArray.leftRotate(arr,2,arr.length);
        rotateArray.printArray(arr,arr.length);
    }
}
