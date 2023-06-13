package org.example.Demo;

public class HCF {
    public static void main(String[] args) {
        int n=16;
        int m=34;
        System.out.println(hcf(n,m));
    }
    public static int hcf(int n,int m){
        if (m==0)
            return n;
        return hcf(m,n%m);
    }
}
