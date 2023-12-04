import java.util.*;

public class Finding_Nos_Matrix {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("no. of rows: ");
        int rows = sc.nextInt();
        System.out.print("no. of coloumns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Write the input of the given Matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Write the number you want to find in the matrix: ");
        int find = sc.nextInt();

        // finding the number

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == find) {
                    System.out.print("Your number is on the location " + "row = " + i + " cols = " + j);
                }
            }
        }
    }
}
