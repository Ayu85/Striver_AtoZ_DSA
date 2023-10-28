public class searchRotatedSortedArray {
    static int getELement(int[] arr, int n, int target) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target)
                return mid;
            // check for the sorted part(left part)
            else if (arr[low] <= arr[mid]) {

            } 
            //check sorted right part
            else {

            }
        }
    }

    public static void main(String[] args) {

    }
}