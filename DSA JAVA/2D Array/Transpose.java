import java.util.Scanner;

import java.util.*;

public class Transpose {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);

        System.out.print("Total nos. of Rows Required: ");
        int rows = sc.nextInt();
        System.out.print("Total nos. of Coloumns Required: ");
        int cols = sc.nextInt();
        
        
        int[][] matrix = new int[rows][cols];

        System.out.println("Input the numbers in the matrix from rows to columns ways");
        //Taking Input
        for(int j=0; j<rows; j++){
            for(int k=0; k<cols; k++){
                matrix[j][k] = sc.nextInt();
            }
        }

        System.out.println("Your input Matrix looks like this: ");
        for(int i=0; i<rows; i++){
            for(int k =0; k<cols; k++){
                System.out.print(matrix[i][k]);
            }
            System.out.println();
        }


        System.out.println("Your Transpose Matrix looks like this: ");
        for(int i=0; i<rows; i++){
            for(int k =0; k<cols; k++){
                System.out.print(matrix[k][i]);
            }
            System.out.println();
        }
    }
}
