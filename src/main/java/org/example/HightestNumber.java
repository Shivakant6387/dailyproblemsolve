package org.example;

public class HightestNumber {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,7,89,99};
        int arr2[]={34,54,66,77,88,98,44};
        System.out.println(sL(arr,8));
        System.out.println(sL(arr2,7));
    }
    public static int sL(int []arr,int totals){
        int temp;
        for (int i=0;i<totals;i++){
            for (int j=i;j<totals;j++){
                if (arr[i]>arr[j]){
                    temp = arr[j];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[totals-2];
    }
}
