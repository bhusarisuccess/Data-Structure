package CycleSort;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 2, 1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //{5, 3, 4, 2, 1}
    private static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swapElement(arr,i, correct);
            }else{
                i++;
            }
        }
    }

    private static void swapElement(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
