package Arrays;

public class countSubarraysSumEqualsK {
    static void countSubarrays(int[] arr, int n, int target) {
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    System.out.print(arr[k]);
                }
                if (sum == target)
                    count++;
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        countSubarrays(arr, arr.length, 3);

    }
}
