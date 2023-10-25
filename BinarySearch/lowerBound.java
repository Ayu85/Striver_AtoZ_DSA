public class lowerBound {
    static int getaLowerBound(int[] arr, int len, int x) {
        for (int i = 0; i < len; i++) {
            if (arr[i] >= x)
                return i;
        }
        return len;

    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 8, 15, 19, 19, 19 };
        System.out.println("lower bound: " + getaLowerBound(arr, arr.length, 3));
    }
}
