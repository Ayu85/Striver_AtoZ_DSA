public class bubbleSort {
    static int[] bubbSort(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 2, 4, 5, 0, 3, 10, 8, 6 };
        int[] res = bubbSort(nums, nums.length);
        for (int x : res)
            System.out.print(x + " ");

    }
}
