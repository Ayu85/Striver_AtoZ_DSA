package Arrays;

public class longestSubarraySumRqualsK {
    static void getSubArray(int[] arr, int n, int x) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int Length = 0;
            for (int j = 0; j <= i; j++) {
                sum += arr[j];
                Length++;
            }
            if (sum == x && Length > max) {
                max = Length;
            }

        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1,1 };
        getSubArray(arr, arr.length, 2);
    }
}
