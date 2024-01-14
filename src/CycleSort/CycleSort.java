package CycleSort;

import java.util.Arrays;

// If you find the array in range use Cycle Sort
public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 2, 1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //{5, 3, 4, 2, 1}
    private static void cyclicSort(int[] arr) {
       int i =0;
       while (i< arr.length){
           int correctIndex = arr[i]-1;
           if (arr[i]!= arr[correctIndex]){
               swapElement(arr,i,correctIndex);
           }else {
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
