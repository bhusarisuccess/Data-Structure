package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int []arr = {-18, -12, 0, 2, 4, 15, 16, 22, 45, 85};
        int target = 22;
        System.out.println(orderAgnosticBS(arr, target));
    }


    private static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // find weather the array is ascending or descending
        boolean isAsec = arr[start] < arr[end];

        while (start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsec) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
