package Arrays;

public class numberAppearingOnce {
    static int findAppearingOnce(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            int count = 0;
            int key = arr[i];
            for (int j = 0; j < n; j++) {
                if (arr[j] == key) {
                    count++;
                }
            }
            if (count == 1)
                return key;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 4, 4 };
        System.out.println(findAppearingOnce(arr, arr.length));
    }
}
