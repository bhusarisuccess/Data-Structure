package CycleSort;

import static CycleSort.FindAllNumbersDisappeared.findDisappearedNumbers;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.print(findDuplicate(arr));
    }

    private static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {

            if (nums[i] != i + 1) {

                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swapNumber(nums, i, correct);
                } else {
                    return nums[i];
                }

            } else {
                i++;
            }

        }
        return -1;
    }

    private static void swapNumber(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
