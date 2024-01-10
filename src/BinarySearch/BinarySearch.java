package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {4, 6, 7, 8, 10, 11, 12, 14};
        int target = 6;
        System.out.println(binarySearch(arr, target));
    }

    // return index
    // return -1 if it does not exist
    static private int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
