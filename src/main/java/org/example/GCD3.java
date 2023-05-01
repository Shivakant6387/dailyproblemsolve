package org.example;

public class GCD3 {
    public static void main(String[] args) {
        int n=16,m=34;
        int gcd=1;
        for (int i=1;i<=n&& i<=m;++i){
            if(n%i==0 && m%i==0)
                gcd=i;
        }
        System.out.println("gcd "+n+" and "+m+" is "+gcd);
    }
}
