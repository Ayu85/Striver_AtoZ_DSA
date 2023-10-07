package Arrays;

public class leftRotateByDplaces {
    static int[] rotateByD(int[] arr, int n, int D) {
        int temp[] = new int[D];
        for (int i = 0; i < D; i++) {
            temp[i] = arr[i];
        }

        int j = 0;
        for (int i = D; i < n; i++) {
            arr[i - D] = arr[i];
            j++;
        }
        System.out.println(j);
        int k = 0;
        for (int i = n-D; i < n; i++) {
            arr[i] = temp[k];
            k++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        rotateByD(arr, arr.length, 3);
        for (int x : arr)
            System.out.print(x + " ");

    }
}