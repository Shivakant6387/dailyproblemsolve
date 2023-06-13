package org.example.Demo;

public class LCM {
    public static void main(String[] args) {
        int arr[]={12,15,9,10,6,3};
        System.out.println(lcm(arr));
    }
    static long lcm(int arr[]){
        long lcm=1;
        int divisor=2;
        while(true){
            int counter=0;
            boolean divisible=false;
            for (int i=0;i<arr.length;i++){
                if (arr[i]==0){
                    return 0;
                } else if (arr[i]<0) {
                    arr[i]=arr[i]*(-1);

                }if (arr[i]==1){
                    counter++;
                }
                if (arr[i]%divisor==0){
                    divisible=true;
                    arr[i]=arr[i]/divisor;
                }
            }
            if (divisible){
                lcm=lcm*divisor;
            }else {
                divisor++;
            }
            if (counter== arr.length){
                return lcm;
            }
        }
    }
}
