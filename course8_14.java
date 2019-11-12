import java.util.Scanner;

public class course8_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size for the matrix : ");

        int i, k;
        int lowRow = 0, highRow = 0, row = 0, column = 0, lowColumn = 0, highColumn = 0;
        int lowMajorDiagonal = 0, highMajorDiagonal = 0, majorDiagonal = 0;
        int n = input.nextInt();
        int[][] matrix = new int[n][n];

        for (i = 0; i < n; i++) {
            for (k = 0; k < n; k++) {
                if (Math.random() < 0.5)
                    matrix[i][k] = 0;
                else
                    matrix[i][k] = 1;
            }
        }

        for (i = 0; i < n; i++) {
            for (k = 0; k < n; k++) {
                System.out.print(matrix[i][k] + " ");
            }
            System.out.print("\n");
        }


        /* row */
        for (i = 0; i < n; i++) {
            for (k = 0; k < n; k++) {
                if (matrix[i][k] == 0)
                    lowRow++;
                else
                    highRow++;
            }
            if (lowRow == n) {
                System.out.println("All 0s on row : " + i);
                row = 1;
            }
            if (highRow == n) {
                System.out.println("All 1s on row : " + i);
                row = 1;
            }

            lowRow = highRow = 0;
        }

        if (row != 1)
            System.out.println("No same numbers on a row");


        /* column */
        for (k = 0; k < n; k++) {
            for (i = 0; i < n; i++) {
                if (matrix[i][k] == 0)
                    lowColumn++;
                else
                    highColumn++;
            }
            if (lowColumn == n) {
                System.out.println("All 0s on column : " + k);
                column = 1;
            }
            if (highColumn == n) {
                System.out.println("All 1s on column : " + k);
                column = 1;
            }

            lowColumn = highColumn = 0;
        }

        if (column != 1)
            System.out.println("No same numbers on a column");


        /* major diagonal */
        for (i = 0; i < n; i++) {
            if (matrix[i][i] == 0)
                lowMajorDiagonal++;
            else
                highMajorDiagonal++;
        }

        if (lowMajorDiagonal == 4) {
            System.out.println("All 0s on major diagonal");
            majorDiagonal = 1;
        }
        if (highMajorDiagonal == 4) {
            System.out.println("All 1s on major diagonal");
            majorDiagonal = 1;
        }
        if (majorDiagonal != 1)
            System.out.println("No same numbers on the major diagonal");


        lowMajorDiagonal = highMajorDiagonal = majorDiagonal =  0;

        for (i = n - 1; i <= 0; i--) {
            if (matrix[i][i] == 0)
                lowMajorDiagonal++;
            else
                highMajorDiagonal++;
        }

        if (lowMajorDiagonal == 4) {
            System.out.println("All 0s on sub-diagonal");
            majorDiagonal = 1;
        }
        if (highMajorDiagonal == 4) {
            System.out.println("All 1s on sub-diagonal");
            majorDiagonal = 1;
        }

        if (majorDiagonal != 1)
            System.out.println("No same numbers on the sub-diagonal");
    }
}
