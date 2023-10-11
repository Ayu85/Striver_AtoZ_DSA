package Arrays;

public class findMissingOptimal {
    static int getMissing(int[] arr, int n) {
        int sumOfAll = (n * (n + 1)) / 2;
        int arrSum = 0;
        for (int x : arr)
            arrSum += x;

        return sumOfAll - arrSum;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 3 };
        System.out.println(getMissing(arr, 6));
    }
}
