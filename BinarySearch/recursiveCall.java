public class recursiveCall {
    static int binSearch(int[] arr, int low, int high, int target) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == target)
            return mid;
        else if (target < arr[mid])
            return binSearch(arr, low, mid - 1, target);
        else
            return binSearch(arr, mid + 1, high, target);

    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 8, 9, 10, 44, 55 };
        System.out.println(binSearch(arr, 0, arr.length - 1, 55));

    }
}
