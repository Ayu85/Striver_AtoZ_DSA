public class quickSort {
    static int getPartition(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        int pivot = arr[low];
        while (i < j) {
            while (arr[i] <= pivot && i < high) {
                i++;
            }
            while (arr[j] > pivot && j >= low) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else {
                int temp = arr[low];
                arr[low] = arr[j];
                arr[j] = temp;
            }
        }
        return j;
    }

    static void quick_sort(int [] arr,int low,int high){
        if(low<high){
            int partElement=getPartition(arr, low, high);
            quick_sort(arr, low, partElement-1);
            quick_sort(arr, partElement+1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 0, 1, 8,-5,-2,-1 };
        quick_sort(arr, 0, arr.length-1);
        for(int x:arr)
        System.out.print(x+" ");
    }

}
