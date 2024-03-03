package BubbleSort;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 0};
        sortElement(arr);
        System.out.println(Arrays.toString(arr));
    }


    private static void sortElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
