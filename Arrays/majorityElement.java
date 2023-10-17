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
        int[] arr = { 2, 3, 3, 3, 1, 2, 3 };
        System.out.println(getElement(arr, arr.length));
    }
}
