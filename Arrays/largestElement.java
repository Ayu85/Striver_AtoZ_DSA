package Arrays;

public class largestElement {
    static int findLargest(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 0, 3, -5, 8, 45, 8889, 2 };
        System.out.println(findLargest(arr, arr.length));
    }
}
