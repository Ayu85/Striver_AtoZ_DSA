package Arrays;

public class missingNumber_Brute {
    static int findMissing(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5 };
        System.out.println(findMissing(arr, 5));
    }
}
