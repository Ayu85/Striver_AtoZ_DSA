package Arrays;

public class rotateMatrix90deg {

    static void rotate(int[][] arr, int n, int m) {
        int[][] tempMatrix = new int[n][m];
        int k = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tempMatrix[j][k] = arr[i][j];
            }
            k--;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = tempMatrix[i][j];
            }

        }
    }

    static void printMatrix(int[][] arr, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "       ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        System.out.println("Before rotation by 90deg: ");
        printMatrix(matrix, 4, 4);
        rotate(matrix, 4, 4);
        System.out.println("After rotation by 90deg: ");
        printMatrix(matrix, 4, 4);

    }
}
