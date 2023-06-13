package org.example.Demo;

public class ASpecialKeyboard {
    public static void main(String[] args) {
        int n;
        for (n=1;n<=20;n++)
            System.out.println("Maximum of A`s with keyStrokes is "+n+findoptimal(n)  );
    }
    static int findoptimal(int n){
        if (n<=6)
            return n;
        int max=0;
        int b;
        for (b=n-3;b>=1;b--){
            int curr=(n-b-1)*findoptimal(b);
            if (curr>max)
                max=curr;
        }
        return max;
    }
}
