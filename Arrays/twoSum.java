package Arrays;

public class twoSum {
    // static boolean twoSumFunc(int[] arr, int len, int target) {
    // for (int i = 0; i < len - 1; i++) {
    // for (int j = i + 1; j < len; j++) {
    // if (arr[i] + arr[j] == target)
    // return true;
    // }
    // }
    // return false;
    // }
    static int[] twoSumFunc(int[] arr, int len, int target) {
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] + arr[j] == target)
                    return new int[] { i, j };
            }
        }
        return new int[] { 0 };
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 5, 8, 11 };
        // System.out.println(twoSumFunc(arr, arr.length, 1));
        int[] response = twoSumFunc(arr, arr.length, 8);
        for (int x : response)
            System.out.println(x);
    }
}
