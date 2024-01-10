package BinarySearch;

public class FirstAndLastOccurance {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 7;
        System.out.println(""+searchRange(nums, target));
    }

    static public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = findPosition(nums, target, true);
        int end = findPosition(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    private static int findPosition(int[] arr, int target, boolean findStartIndex) {
        int start = -1;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    return mid - 1;
                } else {
                    return start = mid + 1;
                }
            }
        }
        return ans;
    }
}
