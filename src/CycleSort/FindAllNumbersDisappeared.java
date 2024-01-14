package CycleSort;

import java.util.ArrayList;
import java.util.List;

//Find All Numbers Disappeared in an Array
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
public class FindAllNumbersDisappeared {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.print(findDisappearedNumbers(arr));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List missing = new ArrayList<Integer>();

        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swapElement(nums, i, correctIndex);
            } else {
                i++;
            }

        }

        // find missing
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                missing.add(index + 1);
            }
        }

        return missing;
    }

    private static void swapElement(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
