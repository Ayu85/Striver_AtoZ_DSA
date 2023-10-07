package Arrays;

public class leftRotateBy1Place {
    static int[] rotateBy1(int[] arr, int n) {
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        rotateBy1(arr, arr.length);
        for (int x : arr)
            System.out.print(x + " ");
    }

}
