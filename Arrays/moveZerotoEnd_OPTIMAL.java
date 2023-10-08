package Arrays;

public class moveZerotoEnd_OPTIMAL {
    static void moveAllZeroes(int[] nums, int n) {
        // 1,0,2,3,2,0,0,4,5,1
        //   j,i
        int j = 1;
        for (int i = 2; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };
        moveAllZeroes(arr, arr.length);
        for (int x : arr)
            System.out.print(x+" ");

    }
}
