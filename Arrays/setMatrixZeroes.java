package Arrays;

public class setMatrixZeroes {
    static void markRow(int[][] arr, int r, int m) {
        for (int i = 0; i < m; i++) {
            if (arr[r][i] != 0)
                arr[r][i] = -1;
        }
    }

    static void markCol(int[][] arr, int c, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i][c] != 0)
                arr[i][c] = -1;
        }
    }

    static void setZeroes(int[][] arr, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    markRow(arr, i, m);
                    markCol(arr, j, n);
                }
            }
        }
        markZeroes(arr, n, m);
    }

    static void markZeroes(int[][] arr, int n, int m) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (arr[i][j] == -1)
                    arr[i][j] = 0;
            }

        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 1, 1, 1 }, { 1, 0, 0, 1 }, { 1, 1, 0, 1 }, { 1, 1, 1, 1 } };
        System.out.println("Matrix Before Setting Zeroes: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
        setZeroes(arr, 4, 4);
        System.out.println("Matrix After Setting Zeroes: ");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
