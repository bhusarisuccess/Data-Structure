package LeanearSearch;

public class EvenDigit {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }

    static private int findNumbers(int[] nums) {
       int evenCount = 0;
        for (int num:nums) {
            int count = 0;
            while (num > 0) {
                count++;
                num = num / 10;

            }
            if(count%2 ==0){
                evenCount++;
            }
        }
        return evenCount;
    }
}
