package org.example.DSA.array;

public class ArraySumIndexBase {
    static void sumArrayPrint(int arr[],int n,int  sum) {
        for (int i = 0; i < n; i++) {
            int currentSum = arr[i];

            if (currentSum == sum) {
                System.out.println("Sum found at indexe "
                        + i);
                return;
            }
            else {
                // Try all subarrays starting with 'i'
                for (int j = i + 1; j < n; j++) {
                    currentSum += arr[j];

                    if (currentSum == sum) {
                        System.out.println(
                                "Sum found between indexes " + i
                                        + " and " + j);
                        return;
                    }
                }
            }
        }
        System.out.println("No subarray found");
        return;
    }
    public static void main(String[] args) {
        int arr[]={1,4,20,3,10,5};
        int n=arr.length;
        int sum=33;
        sumArrayPrint(arr,n,sum);
    }


}
