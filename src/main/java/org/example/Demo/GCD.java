package org.example.Demo;

public class GCD {
    public static void main(String[] args) {
        int a =98;
        int b=56;
        System.out.println("GCD " +a+" and "+b+" is "+gcd(a,b));
    }
    static int gcd(int a, int b){
        int result =Math.min(a,b);
        while(result>0){
            if (a%result==0 && b% result==0){
                break;
            }
            result--;
        }
        return result;
    }
}
