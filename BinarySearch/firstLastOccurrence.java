public class firstLastOccurrence {
    static int[] getOccurrances(int[] arr, int n, int x) {
        int first = -1;
        int last = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                if (first == -1)
                    first = i;
                else
                    last = i;
            }
        }
        return new int[] { first, last };
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 8, 8, 8, 9, 10 };
        int res[] = getOccurrances(arr, arr.length, 8);
        for (int x : res)
            System.out.print(x + "   ");
    }
}