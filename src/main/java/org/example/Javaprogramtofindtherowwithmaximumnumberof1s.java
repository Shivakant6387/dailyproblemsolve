package org.example;

public class Javaprogramtofindtherowwithmaximumnumberof1s {
    static int r=4,c=4;
    static int rowWithMax1s(int mat[][]){
        int j,max_row_index=0;
        j=c-1;
        for (int i=0;i<r;i++){
            while (j>=0 && mat[i][j]==1){
                j=j-1;
                max_row_index=i;
            }
        }
        if (max_row_index==0 && mat[0][c-1]==0)
            return -1;
        return max_row_index;
    }

    public static void main(String[] args) {
        int mat[][] = { { 0, 0, 0, 1 },
                { 0, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 0, 0, 0, 0 } };
        System.out.println("Index of row with maximum 1s is "+ rowWithMax1s(mat));
    }
}
