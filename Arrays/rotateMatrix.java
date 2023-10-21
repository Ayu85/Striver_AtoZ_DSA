package Arrays;

public class rotateMatrix {
    static int[][] rotate(int[][] arr, int n, int m) {
        int[][] tempMatrix = new int[n][m];
        int k = 3;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tempMatrix[j][k] = arr[i][j];

            }
            k--;
        }
        return tempMatrix;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int[][] res = rotate(arr, 4, 4);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }

}
