/* 19. Find Two Numbers Whose Sum is Closest to Zero: Given a sorted array of integers, find two numbers whose sum is
closest to zero. */

// Find Two Numbers Whose Sum is Closest to Zero:- 
//Given a sorted array of integers, find two numbers whose sum is
// closest to zero.

import java.util.Arrays;

public class Q19_NumberCloseToZero {
    public static void FindClose(int[] arr) {
        int n = arr.length;
        int currSum = Integer.MAX_VALUE;
        int minSum = Integer.MAX_VALUE;

        int[] result = new int[2];
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                currSum = arr[i] + arr[j];
                if (Math.abs(currSum) < Math.abs(minSum)) {
                    minSum = currSum;
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        System.out.println(Arrays.toString(result));

    }

    public static void main(String[] args) {
        int arr[] = { -10, -5, -2, 5, 4, 6 };
        FindClose(arr);
    }
}
