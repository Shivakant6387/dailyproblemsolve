package org.example;

public class ValidateAnIpAddress {
    public static String ReFormatString(String S, int K)
    {

        // Create a temporary String to store
        // the alphanumeric characters only
        String temp = "";
        int n = S.length();
        for (int i = 0; i < n; i++) {
            if (S.charAt(i) != '-') {
                temp += (Character.toUpperCase(S.charAt(i)));
            }
        }
        int len = temp.length();

        // String ans is created to store
        // the final String.
        String ans = "";
        int val = K;

        // Iterate over the String from right
        // to left and start pushing
        // characters at an interval of K
        for (int i = len - 1; i >= 0; i--) {
            if (val == 0) {
                val = K;
                ans += '-';
            }
            ans += temp.charAt(i);
            val--;
        }

        // Reverse the final String and
        // return it.
        char[] charArray = ans.toCharArray();
        reverse(charArray, charArray.length);
        String res = new String(charArray);
        return res;
    }


    static void reverse(char a[], int n)
    {
        char t;
        for (int i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
    }

    public static void main(String args[]) {
        String s = "5F3Z-2e-9-w";
        int K = 4;

        // Function Call
        System.out.println(ReFormatString(s, K));

    }
}
