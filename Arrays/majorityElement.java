package Arrays;

public class majorityElement {
    static int getElement(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int count = 0;
            int key = arr[i];
            for (int j = 0; j < n; j++) {
                if (arr[j] == key)
                    count++;
            }
            if (count > n / 2)
                return key;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 3, 3, 1, 2, 3, 3, 2, 1, 3, 2, 3, 1, 54, 46, 341, 63, 46, 6341, 3, 413, 54163, 453, 564,
                64, 31, 3, 1, 21, 3, 41, 3, 1, 32, 1, 32, 41, 3, 564, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
                3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
        System.out.println(getElement(arr, arr.length));
    }
}
