package org.example.testdaily;

import java.util.Scanner;

public class SparseMatrix {
    public static void main(String[] args) {
        int i, j, zero = 0, count = 0;
        int array[][] = new int[10][10];
        System.out.println("Enter total rows and columns: ");
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int column = s.nextInt();
        System.out.println("Enter matrix:");
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < column; j++)
            {
                array[i][j] = s.nextInt();
                System.out.print(" ");
            }
        }
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < column; j++)
            {
                if(array[i][j] == 0)
                {
                    zero++;
                }
                else
                {
                    count++;
                }
            }
        }
        if(zero>count)
        {
            System.out.println("the matrix is sparse matrix");
        }
        else
        {
            System.out.println("the matrix is not a sparse matrix");
        }
    }
}
