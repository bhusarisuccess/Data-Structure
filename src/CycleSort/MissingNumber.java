package CycleSort;

import java.util.ArrayList;
import java.util.List;

//Amazon Question
//https://leetcode.com/problems/missing-number/description/
public class MissingNumber {
    public static void main(String[] args) {
        //  int[] arr = {0, 2, 1, 4};
        // System.out.print(findMissingNumber(arr));
        int[] arr = {1, 2, 4, 6, 7, 9, 10};
        System.out.print(findNumber(arr));
    }

    private static int findMissingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swapElement(arr, i, correct);
            } else {
                i++;
            }
        }

        // find the missing element
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        return arr.length;
    }

    private static void swapElement(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static List<Integer> findNumber(int[] arr) {
        List missingNumbers = new ArrayList<Integer>();
        for (int index = 0; index < arr.length; index++) {
            while (arr[index] != index + 1) {
                missingNumbers.add(index + 1);
            }
        }
        return missingNumbers;
    }
}
