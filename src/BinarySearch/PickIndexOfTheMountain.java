package BinarySearch;

public class PickIndexOfTheMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,4,3,2};
        //System.out.println(peakIndexInMountainArray(arr));
       // System.out.println(findPeakElement(arr));

        int target =4;
        System.out.println(findTheMountainArray(arr, target));
    }

    private static int findTheMountainArray(int[] arr, int target) {
        // Find In mountain array
        int peak = findPeakElement(arr);
        int firstTry = orderAgnostic(arr, target, 0, peak);

        if (firstTry!=-1){
            return firstTry;
        }

        int secondTry = orderAgnostic(arr, target, peak+1, arr.length -1);
        if (secondTry!=-1){
            return secondTry;
        }
        return -1;
    }

    private static int orderAgnostic(int[] arr, int target, int start, int end) {
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

    static private int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
               end = mid;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid+1;
            }
        }
        return start;
    }

    static public int findPeakElement(int[] nums) {
        int start = 0;
        int end  = nums.length - 1;

        while(start<end){
            int mid = start +(end-start)/2;
            if(nums[mid]> nums[mid+1]){
                end = mid;
            }else{
                start =mid +1;
            }
        }
        return start;
    }
}
