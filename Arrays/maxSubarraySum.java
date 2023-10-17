package Arrays;

public class maxSubarraySum {
    static int getMaxSum(int[] arr, int n) {
        int maxSum = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    System.out.print(arr[k] + ",");
                }
                if (sum > maxSum)
                    maxSum = sum;
                System.out.print(" ");
            }
            System.out.println();
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println(getMaxSum(arr, arr.length));
    }
}
