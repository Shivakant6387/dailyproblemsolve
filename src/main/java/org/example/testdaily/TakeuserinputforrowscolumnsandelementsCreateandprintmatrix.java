package org.example.testdaily;

import java.util.Scanner;

public class TakeuserinputforrowscolumnsandelementsCreateandprintmatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of matrix rows");
        int matrixRow=scanner.nextInt();
        System.out.println("Enter the number of matrix cols");
        int matrixCol=scanner.nextInt();
        int matrix [][]=new int[matrixRow][matrixCol];
        enterMatrixData(scanner,matrix,matrixRow,matrixCol);
        printMatrix(matrix,matrixRow,matrixCol);
    }

    public static void enterMatrixData(Scanner scanner, int[][] matrix, int matrixRow, int matrixCol){
        System.out.println("Enter the Matrix Data");
        for (int i=0;i<matrixRow;i++){
            for (int j=0;j<matrixCol;j++){
                matrix[i][j]=scanner.nextInt();
            }
        }
    }

    public static void printMatrix(int[][] matrix, int matrixRow, int matrixCol){
        System.out.println("Your Matrix is :");
        for (int i=0;i<matrixRow;i++){
            for (int j=0;j<matrixCol;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
