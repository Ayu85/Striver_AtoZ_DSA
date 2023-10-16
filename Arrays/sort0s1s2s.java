package Arrays;

public class sort0s1s2s {
    static void sortAll(int[] arr, int n) {
        int count0 = 0;
        int count1 = 0;
        // int count2 = 0;
        for (int x : arr) {
            if (x == 0)
                count0++;
            else if (x == 1)
                count1++;

        }
        for (int i = 0; i < count0; i++)
            arr[i] = 0;
        for (int i = count0; i < count0 + count1; i++)
            arr[i] = 1;
        for (int i = count1 + count0; i < n; i++)
            arr[i] = 2;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 2, 1, 0, 1, 2, 1, 0 };
        
        sortAll(arr, arr.length);
        for (int x : arr)
            System.out.print(x + " ");
    }
}
