package Arrays;

import java.util.ArrayList;

public class leadersInArray {
    static ArrayList<Integer> getLeaders(int[] arr, int n) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader == true)
                temp.add(arr[i]);
        }
        temp.add(arr[arr.length - 1]);
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 22, 12, 3, 0, 6, 8 };
        ArrayList<Integer> res = getLeaders(arr, arr.length);
        System.out.println("leaders in the given array is: ");
        for (int x : res)
            System.out.print(x + " ");
    }
}
