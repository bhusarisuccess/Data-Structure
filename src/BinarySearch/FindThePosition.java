package BinarySearch;

// find the position of element in infinite array
public class FindThePosition {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,7,8,9};
        int target = 9;
        System.out.println(findTheElement(arr,target));
    }

    static private int findTheElement(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return findThePosition(arr, target,start, end);
    }

    private static int findThePosition(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
