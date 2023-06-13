package org.example.Demo;

public class GCD2 {
    static int hcf(int a, int b){
        if (b==0)
            return a;
        return hcf(b,a%b);
    }
    public static void main(String[] args) {
        int a=98,b=56;
        System.out.println(hcf(a,b));
    }
}
