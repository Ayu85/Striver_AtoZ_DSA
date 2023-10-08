package Arrays;

public class moveZeroestoEnd {
    static int[] moveAllZeroes(int[] arr, int n) {
        int count = 0;
        int j = 0;
        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[j] = arr[i];
                j++;
                count++;
            }
        }
        for (int i = count + 1; i < n; i++) {
            temp[i] = 0;
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };
        int[] res = moveAllZeroes(arr, arr.length);
        for (int x : res)
            System.out.print(x + " ");
    }
}