package Arrays;

import java.util.ArrayList;

public class intersection_TwoPointerApproach {
    static ArrayList<Integer> getINtersection(int[] a, int[] b, int n1, int n2) {
        ArrayList<Integer> temp = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < n1; i++) {
            if (a[i] == b[j]) {
                temp.add(a[i]);
                j++;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 4, 5, 6 };
        int[] arr2 = { 2, 3, 3, 5, 6, 6, 7 };
        ArrayList<Integer> result = getINtersection(arr, arr2, arr.length, arr2.length);
        for (int x : result)
            System.out.print(x + " ");
    }
}
