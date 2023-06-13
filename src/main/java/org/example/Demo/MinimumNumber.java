package org.example.Demo;

public class MinimumNumber {
    public static void main(String[] args) {
    String a="abcd",b="cdabcdab";
        System.out.println(min_rep(a,b));
    }
    static boolean issubstring(String str1,String rep1){
        int M=str1.length();
        int N=rep1.length();
        for (int i=0;i<N-M;i++){
            int j;
            for (j=0;j<M;j++)
                if (rep1.charAt(i+j)!=str1.charAt(j))
                    break;
            if (j==M)
                return true;
        }
        return false;
    }
    static int min_rep(String a,String b){
        int ans=1;
        String s=a;
        while (s.length()<b.length()){
            s+=a;
            ans++;
        }
        if (issubstring(b,s))return ans;
        if (issubstring(b,s+a))return ans+1;
        return -1;
    }
}
