public class selectionSort {
    static int[] sort(int[] arr, int n) {
        for (int i = 0; i <= n - 2; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 3, 6, 0, 4 };
        int res[] = sort(arr, arr.length);
        for (int x : res)
            System.out.println(x);
    }
}