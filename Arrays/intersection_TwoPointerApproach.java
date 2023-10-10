package Arrays;

import java.util.ArrayList;

class intersection_TwoPointerApproach {
    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> temp = new ArrayList<>();
        int j = 0;
        int i = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                temp.add(nums1[i]);
                i++;
                j++;
            } else
                i++;
        }
        int[] arr = new int[temp.size()];
        int k = 0;
        for (int x : temp) {
            arr[k] = x;
            k++;
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 1 };
        int[] arr2 = { 2, 2, 3, 3, 4 };
        int[] res = intersect(arr, arr2);
        for (int x : res)
            System.out.print(x + " ");
    }
}