package Recursion;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(searchElement(arr, 7, 0, arr.length));
    }

    private static int searchElement(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        if (target < arr[mid]) {
            return searchElement(arr, target, start, mid-1);
        }
        return searchElement(arr, target, mid+1, end);
    }
}
