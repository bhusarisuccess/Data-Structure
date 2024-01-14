package CycleSort;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesNumber {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.print(findDuplicates(arr));
    }

    public static List<Integer> findDuplicates(int[] nums) {

        List<Integer> ans = new ArrayList();

        int i = 0;
        while (i < nums.length) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swapNumber(nums, i, correct);
                } else {
                   i++;
                }
        }


        // find the duplecates number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index]!= index+1){
                ans.add(nums[index]);
            }
        }
        return ans;
    }

    private static void swapNumber(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
