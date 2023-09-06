import java.util.Scanner;

class matrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows");
        int row = sc.nextInt();
        System.out.println("enter the no of cols");
        int col = sc.nextInt();
        int[][] x = new int[row][col];
        int[][] y = new int[row][col];
        System.out.println("first matrix");
        for (int m = 0; m < row; m++) {
            for (int n = 0; n < col; n++) {
                x[m][n] = sc.nextInt();

            }

        }
        System.out.println("first matrix");
        for (int m = 0; m < row; m++) {
            for (int n = 0; n < col; n++) {
                System.out.print(x[m][n] + "\t");

            }
            System.out.println();

        }

        System.out.println("enter SECOND MATRIX");
        for (int m = 0; m < row; m++) {
            for (int n = 0; n < col; n++) {
                y[m][n] = sc.nextInt();
            }

        }
        System.out.println("second matrix");
        for (int m = 0; m < row; m++) {
            for (int n = 0; n < col; n++) {
                System.out.print(y[m][n] + "\t");

            }
            System.out.println();

        }
        int[][] z = new int[row][col];
        for (int m = 0; m < row; m++) {
            for (int n = 0; n < col; n++) {
                z[m][n] = x[m][n] + y[m][n];
            }
        }

        // System.out.println("the addition of a matrix");
        // for (int m = 0; m < row; m++) {
        // for (int n = 0; n < col; n++) {
        // System.out.println(z[m][n] + "\t");

        // }
        // System.out.println();
        // }
        System.out.println("addition");
        for (int m = 0; m < row; m++) {
            for (int n = 0; n < col; n++) {
                System.out.print(z[m][n] + "\t");

            }
            System.out.println();

        }
    }
}