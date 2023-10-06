package Arrays;

public class secondLargest {
    static int secLargest(int[] arr, int n) {
        int max = arr[0];
        int secMax = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            } else if (arr[i] > secMax)
                secMax = arr[i];

        }
        return secMax;
    }

    public static void main(String[] args) {
        int[] arr = {
                48, 96, 46, 75, 71, 5, 58, 57

        };
        System.out.println(secLargest(arr, arr.length));
    }
}
