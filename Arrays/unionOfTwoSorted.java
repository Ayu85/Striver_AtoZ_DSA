package Arrays;

import java.util.SortedSet;
import java.util.TreeSet;

public class unionOfTwoSorted {
    static int[] union(int[] arr1, int[] arr2) {
        SortedSet<Integer> tempSet = new TreeSet<>();
        for (int i = 0; i < arr1.length; i++) {
            tempSet.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            tempSet.add(arr2[i]);
        }
        int[] unionArr = new int[tempSet.size()];
        int i = 0;
        for (Integer x : tempSet) {
            unionArr[i++] = x;
        }
        return unionArr;

    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 2, 3, 4, 5, 7, 7, 8 };
        int[] arr2 = { 2, 3, 4, 4, 5, 6, 8, 9 };
        int[] res = union(arr1, arr2);
        for (int x : res)
            System.out.print(x + " ");
    }
}
