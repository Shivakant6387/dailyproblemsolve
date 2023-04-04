package org.example.problem;

public class SingleNumber {
    public static int singleNumber(int arr[],int n){
        int single=0 ,flag=0;
        for (int i=0;i<n;i++){
            flag=0;
            single=arr[i];
            for (int j=0;j<n;j++){
                if ((arr[j]==single)&&(j!=i)){
                    flag=1;
                }
            }
            if (flag==0){
                return single;
            }
        }
        return single;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,5,2,1,3};
        int n=arr.length;
        System.out.println(singleNumber(arr,n));
    }
}
