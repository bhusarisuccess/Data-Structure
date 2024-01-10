package LeanearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {16, 12, -7, 3, 14, 28};
        System.out.println(minimum(arr));
        System.out.println(maximum(arr));
    }

    private static int minimum(int[] arr) {
        int ans = arr[0];
        for (int index = 1; index<arr.length;index++){
            if (ans > arr[index]){
                ans = arr[index];
            }
        }
        return ans;
    }

    private static int maximum(int[] arr) {
        int ans = arr[0];
        for (int index = 1; index<arr.length;index++){
            if (ans < arr[index]){
                ans = arr[index];
            }
        }
        return ans;
    }
}
