package org.example.Demo;

public class FindtheNthcharacter {
    public static void main(String[] args) {
        int m=5,k=5,n=3;
        KthCharacter(m,n,k);
    }
    static void KthCharacter(int m,int n,int k){
        int distance= (int) Math.pow(2,n);
        int Block_number=k/distance;
        int remaining=k%distance;
        int s[]=new int[32];
        int x=0;
        for (;m>0;x++){
            s[x]=m%2;
            m=m/2;
        }
        int root=s[x-1-Block_number];
        if (remaining==0){
            System.out.println(root);
            return;
        }
        Boolean flip=true;
        while (remaining>1){
            if ((remaining & 1)>0){
                flip=!flip;
            }
            remaining=remaining>>1;
        }
        if (flip){
            System.out.println((root>0)?0:1);
        }
        else {
            System.out.println(root);
        }
    }
}
