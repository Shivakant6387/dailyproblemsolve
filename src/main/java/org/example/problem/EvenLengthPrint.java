package org.example.problem;

public class EvenLengthPrint {
    public static void main(String[] args) {
        int N=50;
        String result;
        if(N%2 == 0) {
            if( (N >=2 && N <=5) || N > 20) {
                result = "Ravi";
            } else {
                result = "Shiva";
            }
        } else {
            result = "Ravi";
        }
        System.out.println(result);
    }
}
