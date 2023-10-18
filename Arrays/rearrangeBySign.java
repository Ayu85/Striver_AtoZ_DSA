package Arrays;

public class rearrangeBySign {
    static void reArrange(int[] arr, int n) {
        int[] temp = new int[n];
        int x = 0;
        int y = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                temp[x] = arr[i];
                x += 2;
            } else {
                temp[y] = arr[i];
                y += 2;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, -2, -5, 2, -4 };
        System.out.println("Before Rearrangement of Array: ");
        for (int x : arr)
            System.out.print(x + " ");
        reArrange(arr, arr.length);
        System.out.println("After Rearrangement of Array: ");
        for (int x : arr)
            System.out.print(x + " ");
    }

}