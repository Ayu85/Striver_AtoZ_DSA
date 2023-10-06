package Arrays;

public class removeDupFromSorted {

    static int[] remove(int[] arr, int n) {
        int i = 0;
        int count = 1;
        for (int j = 1; j < n; j++) {
            if (arr[i] != arr[j]) {
                arr[++i] = arr[j];
                count++;
            }
        }
        System.out.println(count);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 3, 3, 3, 4, 5, 5 };
        int[] res = remove(arr, arr.length);
        for (int x : res)
            System.out.print(x + " ");
    }
}
