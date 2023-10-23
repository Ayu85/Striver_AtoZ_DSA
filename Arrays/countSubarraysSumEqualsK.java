package Arrays;

public class countSubarraysSumEqualsK {
    static int countSubarrays(int[] arr, int n, int target) {
        int count = 0;
        // for (int i = 0; i < n - 1; i++) {
        // for (int j = 0; j < n; j++) {
        // int sum = 0;
        // for (int k = i; k <= j; k++) {
        // sum += arr[k];
        // }
        // if (sum == target)
        // count++;
        // }
        // }
        // return count;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == target)
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, -3, 1, 1, 1, 4, 2, -3 };
        System.out.println(countSubarrays(arr, arr.length, 3));
        System.out.println("commit");

    }
}
