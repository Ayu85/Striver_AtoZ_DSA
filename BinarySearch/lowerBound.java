public class lowerBound {
    static int getaLowerBound(int[] arr, int len, int x) {
        for (int i = 0; i < len; i++) {
            if (arr[i] >= x)
                return i;
        }
        return 0;

    }

public static void main(String[] args) {
    int[] arr={3,4,8,15,19};
    System.out.println(getaLowerBound(arr, arr.length, 15));
}
}
