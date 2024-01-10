package LeanearSearch;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
        System.out.println(maximumWealth(accounts));
    }

    static private int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        for (int[] account : accounts) {
            int wealth = 0;
            for (int element : account) {
                wealth  = wealth + element;
            }
            if (max<wealth){
                max = wealth;
            }
        }
        return max;
    }
}
