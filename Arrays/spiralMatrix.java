package Arrays;

public class spiralMatrix {
    static void printSpiral(int[][] arr, int n, int m) {
        int top = 0;
        int left = 0;
        int right = n - 1;
        int bottom = m - 1;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++)
                System.out.print(arr[top][i] + " ");

            top++;
            for (int i = top; i <= bottom; i++)
                System.out.print(arr[i][right] + " ");

            right--;
            if (left <= right) {
                for (int i = right; i >= left; i--)
                    System.out.print(arr[bottom][i] + " ");
                bottom--;
            }
            if (top <= bottom) {
                for (int i = bottom; i >= top; i-- )
                    System.out.print(arr[i][left] + " ");
                    left++;
            }
        }

    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };
        printSpiral(arr, 5, 4);
    }
}
