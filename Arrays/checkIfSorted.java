package Arrays;

public class checkIfSorted {
    static boolean checkSorted(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
            }
            return true;
        }
        public static void main(String[] args){
            int[]arr={2,3,5};
            System.out.println(checkSorted(arr, arr.length));
        }

}
