package algorithm.remove_min_num_22;

import java.util.Arrays;

public class RemoveMinNum {

    public static int[] solution(int[] arr) {

        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        }
        int min = Integer.MAX_VALUE;
        int cnt = 0;
        for (int a : arr) {
            if (min == a) {
                cnt++;
            }
            if (min > a) {
                cnt = 1;
                min = a;
            }
        }
        int index = 0;
        for (int a : arr) {
            if (a != min) {
                arr[index++] = a;
            }
        }

        return Arrays.copyOf(arr, arr.length - cnt);
    }
}
