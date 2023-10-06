package Arrays;

public class largestElement {
    static int findLargest(int[] arr, int n) {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={2,0,3,-5,8};
        System.out.println(findLargest(arr, arr.length));
    }
}
