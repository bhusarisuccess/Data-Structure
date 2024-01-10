package LeanearSearch;

public class IntegerExamples {

    public static void main(String[] args) {
        int[] arr = {12, 10, 23, 34, 4, 56, 6, 7, 8};
        int target = 56;
        // int index = leanearSearch(arr, target);
        // int index = leanearSearchElement(arr, target);
        boolean index = leanearSearchTrueTrueOrfalse(arr, target);
        System.out.println("Index: " + index);
    }

    private static int leanearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return 0;
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }

    // Search element
    private static int leanearSearchElement(int[] arr, int target) {
        if (arr.length == 0) {
            return 0;
        }
        for (int element : arr) {

            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }


    //Return true or false
    private static boolean leanearSearchTrueTrueOrfalse(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int element : arr) {

            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
