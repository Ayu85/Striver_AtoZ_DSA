package Arrays;

public class maxConsecutiveOnes {
    static int getMax1s(int[] arr, int n) {
        int count = 1;
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    count = 0;
                }
            }
        }
        return count > maxCount ? count : maxCount;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1 };
        System.out.println(getMax1s(arr, arr.length));
    }
}
