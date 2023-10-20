package Arrays;

public class setMatrixZeroesBetter {
    static void interration1(int[][] arr, int n, int m) {
        int[] rowMarker = { 0, 0, 0, 0 };
        int[] colMarker = { 0, 0, 0, 0 };
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    rowMarker[i] = 1;
                    colMarker[j] = 1;
                }
            }
        }
        // itertaion 2
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] != 0 && rowMarker[i] == 1 || colMarker[j] == 1) {
                    {
                        arr[i][j] = 0;
                    }
                }
            }
        }
    }

    static void printMatrix(int[][] arr, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 1, 1, 1 }, { 1, 0, 1, 1 }, { 1, 1, 1, 1 }, { 1, 0, 0, 1 } };
        System.out.println("Before marking zeroes: ");
        printMatrix(arr, 4, 4);
        interration1(arr, 4, 4);
        System.out.println("After marking zeroes: ");
        printMatrix(arr, 4, 4);
    }
}
